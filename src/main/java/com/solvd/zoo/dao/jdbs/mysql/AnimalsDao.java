package com.solvd.zoo.dao.jdbs.mysql;
import java.sql.*;

import com.solvd.zoo.dao.IAnimalsDao;
import com.solvd.zoo.models.AnimalsModel;

public class AnimalsDao implements IAnimalsDao {
    private static final String url = "jdbc:mysql://localhost:3306/zoo";
    private static final String user = "root";
    private static final String password = "1234";

    // JDBC variables for opening and managing connection
    private static Connection con;
    private static Statement stmt;
    private static ResultSet rs;


    @Override
    public AnimalsModel getEntityById(long id) {
        AnimalsModel animalsModel = new AnimalsModel();
        String query = ("SELECT id,neekname, date_of_birth FROM animals where id = " + id);

        try {
            // opening database connection to MySQL server
            con = DriverManager.getConnection(url, user, password);

            // getting Statement object to execute query
            stmt = con.createStatement();

            // executing SELECT query
            rs = stmt.executeQuery(query);

            while (rs.next()) {
                animalsModel.setId(rs.getInt("id"));
                animalsModel.setNickname(rs.getNString("neekname"));
                animalsModel.setDateOfBirth(rs.getString("date_of_birth"));


                }

        } catch (SQLException sqlEx) {
            sqlEx.printStackTrace();
        } finally {
            //close connection ,stmt and resultset here
            try { con.close(); } catch(SQLException se)
            {
                /*can't do anything */
            }
            try { stmt.close(); } catch(SQLException se)
            {
                /*can't do anything */
            }
            try { rs.close(); } catch(SQLException se)
            {
                /*can't do anything */
            }
        }


        return animalsModel;
    }

    @Override
    public void saveEntity(AnimalsModel entity) {
        String query = ("INSERT INTO animals (neekname, date_of_birth) VALUES (\"" + entity.getNickname() + "\",\"" + entity.getDateOfBirth() + "\");");

        try {
            // opening database connection to MySQL server
            con = DriverManager.getConnection(url, user, password);

            // getting Statement object to execute query
            stmt = con.createStatement();

            // executing SELECT query
            System.out.println(query);
            stmt.executeUpdate(query);
            System.out.println("Success");

        } catch (SQLException sqlEx) {
            sqlEx.printStackTrace();
        } finally {
            //close connection ,stmt and resultset here
            try { con.close(); } catch(SQLException se)
            {
                /*can't do anything */
            }
            try { stmt.close(); } catch(SQLException se)
            {
                /*can't do anything */
            }

        }


    }

    @Override
    public void updateEntity(AnimalsModel entity) {
        String query = ("UPDATE animals SET neekname = 'Fedir' WHERE (id = " + entity.getId() + ")");

        try {
            // opening database connection to MySQL server
            con = DriverManager.getConnection(url, user, password);

            // getting Statement object to execute query
            stmt = con.createStatement();

            // executing SELECT query
            System.out.println(query);
            stmt.executeUpdate(query);
            System.out.println("Success");

        } catch (SQLException sqlEx) {
            sqlEx.printStackTrace();
        } finally {
            //close connection ,stmt and resultset here
            try {
                con.close();
            } catch (SQLException se) {
                /*can't do anything */
            }
            try {
                stmt.close();
            } catch (SQLException se) {
                /*can't do anything */
            }


        }
    }

    @Override
    public void removeEntity(long id) {
        String query = ("DELETE FROM animals where id = " + id);

        try {
            // opening database connection to MySQL server
            con = DriverManager.getConnection(url, user, password);

            // getting Statement object to execute query
            stmt = con.createStatement();

            // executing SELECT query
            System.out.println(query);
            stmt.executeUpdate(query);
            System.out.println("Success");

        } catch (SQLException sqlEx) {
            sqlEx.printStackTrace();
        } finally {
            //close connection ,stmt and resultset here
            try { con.close(); } catch(SQLException se)
            {
                /*can't do anything */
            }
            try { stmt.close(); } catch(SQLException se)
            {
                /*can't do anything */
            }

        }




    }
}
