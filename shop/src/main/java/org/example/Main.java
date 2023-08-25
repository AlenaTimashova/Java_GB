package org.example;


import org.example.cache.ProductCache;
import org.example.controller.OrderService;
import org.example.model.Order;
import org.example.model.OrderItem;
import org.example.model.Product;
import org.example.repository.OrderRepository;
import org.example.repository.OrderRepositoryImpl;

import java.sql.SQLException;

public class Main {
    public static void main(String[] args) {
        try {
            // Инициализация репозитория и базы данных.
            OrderRepository repo = new OrderRepositoryImpl("jdbc:sqlite:shop.db");

            // Создание экземпляра сервиса заказов, передавая ему репозиторий для работы с базой данных.
            OrderService service = new OrderService(repo);

            // Создание и инициализация продукта.
            Product book = new Product(1, "Книга", 10.0);
            Product book1 = new Product(2, "Журнал", 20.0);

            // Создание нового заказа.
            Order order = new Order();

            // Добавление продукта в заказ.
            OrderItem orderItem = new OrderItem(book, 2);
            order.addItem(orderItem);
            OrderItem orderItem1 = new OrderItem(book1, 3);
            order.addItem(orderItem1);

            // Сохранение заказа в базе данных с помощью сервиса.
            service.createOrder(order);

            // Получение и вывод последнего заказа из базы данных.
            Order lastOrder = repo.getLastOrder(); // Этот метод вам необходимо реализовать в классе OrderRepository
            if (lastOrder != null) {
                System.out.println("Последний сохраненный заказ:");
                System.out.println(lastOrder);
            } else {
                System.out.println("В базе данных нет заказов.");
            }

            // Создание кэша для продуктов
            ProductCache productCache = new ProductCache();

            // Запрос продукта по ID
            int productId = 2;
            Product product = productCache.getProduct(productId, order);
            System.out.println("Product from cache or list: " + product);

            // Обновление цены продукта
            product.setPrice(15.99);
            productCache.updateProduct(product, order);

            // Запрос обновленного продукта по тому же ID
            product = productCache.getProduct(productId, order);
            System.out.println("Updated product from cache or list: " + product);


        } catch (SQLException e) {
            // Обработка исключений, связанных с работой базы данных.
            e.printStackTrace();
        }
    }
}