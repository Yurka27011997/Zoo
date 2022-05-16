package com.solvd.zoo.dao.jdbs.mysql;

import com.solvd.zoo.MyConnection;

import java.sql.*;
import java.util.ResourceBundle;

public abstract class AbstractDao {

    private Statement statement;
    protected ResultSet resultSet;
    private Connection connection;

    ResourceBundle resource = ResourceBundle.getBundle("db");
    String url = resource.getString("db.url");
    String user = resource.getString("db.user");
    String password = resource.getString("db.password");

    public Connection getConnection () {
        MyConnection.newInstance();
        connection = MyConnection.getConnection(url, user, password);
        return connection;
    }

    public PreparedStatement getPreparedStatement(String sqlQuery) throws SQLException {
        getConnection();
        statement = connection.createStatement();
        PreparedStatement pr = connection.prepareStatement(sqlQuery);
        return pr;

    }

    public void closeAll() {
        if (resultSet != null)
            try {
                resultSet.close();
            } catch (SQLException ignored) {
            }
        if (statement !=  null)
            try {
                statement.close();
            } catch (SQLException ignored){
            }
        if (connection != null)
            try {
                connection.close();
            } catch (SQLException ignored){
            }
    }
}
