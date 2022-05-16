package com.solvd.zoo;

import java.sql.*;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


public class MyConnection {

    private static final Logger LOGGER = LogManager.getLogger(MyConnection.class);

    private static MyConnection instance;

    private MyConnection() {
        try {
            LOGGER.info("Register driver ...");
            Class.forName("com.mysql.cj.jdbc.Driver").newInstance();

        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException e) {
            e.printStackTrace();
        }
    }

    public static MyConnection newInstance() {
        if (instance == null) {
            new MyConnection();
        }
        return instance;
    }

    public static Connection getConnection(String url, String user, String password) {
        try {
            return DriverManager.getConnection(url, user, password);
        } catch (SQLException e ) {
            LOGGER.info("Connection isn`t created! Method returned NULL!");
            LOGGER.error(e);
            return null;
        }
    }
}
