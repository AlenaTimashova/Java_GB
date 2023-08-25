package org.example.cache;
import org.example.model.Order;
import org.example.model.OrderItem;
import org.example.model.Product;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ProductCache {
        private Map<Integer, Product> cache = new HashMap<>();

        /**
         * Получить продукт из кэша или основного списка.
         *
         * @param id           ID продукта.
         * @param order Основной список продуктов в заказе.
         * @return Продукт из кэша или null, если продукт не найден.
         */
        public Product getProduct(int id, Order order) {
            if (cache.containsKey(id)) {
                return cache.get(id);
            } else {
                for (OrderItem item : order.getItems()) {
                    if (item.getProduct().getId() == id) {
                        cache.put(id, item.getProduct());
                        return item.getProduct();
                    }
                }
            }
            return null;
        };

    /**
     * Обновить информацию о продукте в кэше и основном списке.
     *
     * @param product      Обновленная информация о продукте.
     * @param order Основной список продуктов в форме заказа.
     */
    public void updateProduct(Product product, Order order) {
        cache.put(product.getId(), product);
        for (OrderItem item : order.getItems()) {
            if (item.getProduct().getId() == product.getId()) {
                item.setProduct(product);
                break;
            }
        }
    }
}
