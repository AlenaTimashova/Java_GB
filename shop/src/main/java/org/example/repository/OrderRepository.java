package org.example.repository;



import org.example.model.Order;

import java.sql.SQLException;
import java.util.List;

public interface OrderRepository {
    void save(Order order) throws SQLException;
    Order getLastOrder() throws SQLException;
    Order getById(int id) throws SQLException;
}
