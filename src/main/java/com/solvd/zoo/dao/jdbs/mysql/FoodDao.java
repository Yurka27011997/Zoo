package com.solvd.zoo.dao.jdbs.mysql;

import com.solvd.zoo.dao.IFoodDao;
import com.solvd.zoo.models.EmployeesModel;
import com.solvd.zoo.models.FoodModel;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

public class FoodDao extends AbstractDao implements IFoodDao {

    @Override
    public FoodModel getEntityById(long id) {
        FoodModel foodModel = new FoodModel();
        try {

            PreparedStatement pr = getPreparedStatement("SELECT * FROM food WHERE id = ? ");
            pr.setLong(1, id);
            ResultSet rs = pr.executeQuery();

            while (rs.next()) {
                foodModel.setId(rs.getInt("id"));
                foodModel.setName(rs.getString("name"));
                foodModel.setWeight(rs.getInt("weight"));

            }

        } catch (SQLException sqlEx) {
            sqlEx.printStackTrace();
        } finally {
            closeAll();
        }
        return foodModel;


    }

    @Override
    public void saveEntity(FoodModel entity) {
        try {
            PreparedStatement pr = getPreparedStatement("INSERT INTO food (id, name, weight) VALUES (?, ?, ?)");
            pr.setLong(1, entity.getId());
            pr.setString(2, entity.getName());
            pr.setFloat(3, entity.getWeight());
            pr.executeUpdate();

            System.out.println("Success");

        } catch (SQLException sqlEx) {
            sqlEx.printStackTrace();
        } finally {
            closeAll();
        }

    }

    @Override
    public void updateEntity(FoodModel entity) {
        try {
            PreparedStatement pr = getPreparedStatement("UPDATE food SET name = ?, weight = ? WHERE id = ?");
            pr.setString(1,entity.getName());
            pr.setFloat(2,entity.getWeight());
            pr.setLong(3, entity.getId());

            pr.executeUpdate();

            System.out.println("Success");

        } catch (SQLException sqlEx) {
            sqlEx.printStackTrace();
        } finally {
            closeAll();
        }

    }

    @Override
    public void removeEntity(long id) {
        try {
            PreparedStatement pr = getPreparedStatement("DELETE FROM food WHERE id = ?");
            pr.setLong(1, id);

            pr.executeUpdate();

            System.out.println("Success");

        } catch (SQLException sqlEx) {
            sqlEx.printStackTrace();
        } finally {
            closeAll();
        }

    }
}
