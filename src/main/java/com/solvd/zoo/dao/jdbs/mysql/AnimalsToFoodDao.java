package com.solvd.zoo.dao.jdbs.mysql;

import com.solvd.zoo.dao.IAnimalsToFoodDao;
import com.solvd.zoo.models.AnimalsModel;
import com.solvd.zoo.models.AnimalsToFoodModel;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class AnimalsToFoodDao extends AbstractDao implements IAnimalsToFoodDao {
    private static final Logger LOGGER = LogManager.getLogger(AnimalsToFoodDao.class);


    @Override
    public AnimalsToFoodModel getEntityById(long id) {
        AnimalsToFoodModel animalsToFoodModel = new AnimalsToFoodModel();
        try {

            PreparedStatement pr = getPreparedStatement("SELECT * FROM animals_to_food WHERE id = ? ");
            pr.setLong(1, id);
            ResultSet rs = pr.executeQuery();

            while (rs.next()) {
                animalsToFoodModel.setId(rs.getInt("id"));

            }

        } catch (SQLException sqlEx) {
            sqlEx.printStackTrace();
        } finally {
            closeAll();
        }
        return animalsToFoodModel;


    }

    @Override
    public void saveEntity(AnimalsToFoodModel entity) {
        try {
            PreparedStatement pr = getPreparedStatement("INSERT INTO animals_to_food (id) VALUES (?)");
            pr.setLong(1, entity.getId());

            pr.executeUpdate();

            System.out.println("Success");

        } catch (SQLException sqlEx) {
            sqlEx.printStackTrace();
        } finally {
            closeAll();
        }


    }

    @Override
    public void updateEntity(AnimalsToFoodModel entity) {
        try {
            PreparedStatement pr = getPreparedStatement("UPDATE animals_to_food SET id = ? WHERE id = ?");
            pr.setLong(1, entity.getId());

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
            PreparedStatement pr = getPreparedStatement("DELETE FROM animals_to_food WHERE id = ?");
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
