package org.example.repository;


import org.example.model.Order;

import java.sql.SQLException;

public interface OrderRepository {
    void save(Order order) throws SQLException;
    Order getLastOrder() throws SQLException;
    Order getById(int id) throws SQLException;
}
