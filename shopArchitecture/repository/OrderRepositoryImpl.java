package Homeworks.shopArchitecture.repository;

import Homeworks.shopArchitecture.model.Order;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

public class SQLiteOrderRepositoryImpl implements OrderRepository {

    private Connection connection;

    public void SQLiteOrderRepository(String connectionString) {
        try {
            connection = DriverManager.getConnection(connectionString);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void createTable() {
        try {
            Statement statement = connection.createStatement();
            String query = "CREATE TABLE IF NOT EXISTS orders (" +
                    "id INTEGER PRIMARY KEY," +
                    "name TEXT," +
                    "price REAL)";
            statement.execute(query);
            statement.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    @Override
    public Order getById(int id) {
        return null;
    }

    @Override
    public List<Order> getAll() {
        return null;
    }

    @Override
    public void add(Order order) {

    }

    @Override
    public void update(Order order) {

    }

    @Override
    public void delete(int id) {

    }


}
