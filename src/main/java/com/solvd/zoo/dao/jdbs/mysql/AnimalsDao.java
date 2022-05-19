package com.solvd.zoo.dao.jdbs.mysql;
import java.sql.*;

import com.solvd.zoo.dao.IAnimalsDao;
import com.solvd.zoo.models.AnimalsModel;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.ArrayList;
import java.util.List;

public class AnimalsDao extends AbstractDao implements IAnimalsDao {
    private static final Logger LOGGER = LogManager.getLogger(AnimalsDao.class);



    @Override
    public AnimalsModel getEntityById(long id) {
        AnimalsModel animalsModel = new AnimalsModel();
        try {

            PreparedStatement pr = getPreparedStatement("SELECT * FROM animals WHERE id = ? ");
            pr.setLong(1, id);
            ResultSet rs = pr.executeQuery();

            while (rs.next()) {
                animalsModel.setId(rs.getInt("id"));
                animalsModel.setNickname(rs.getNString("neekname"));
                animalsModel.setDateOfBirth(rs.getString("date_of_birth"));
            }

        } catch (SQLException sqlEx) {
            sqlEx.printStackTrace();
        } finally {
            closeAll();
        }
        return animalsModel;
    }

    @Override
    public void saveEntity(AnimalsModel entity) {

        try {
            PreparedStatement pr = getPreparedStatement("INSERT INTO animals (id, neekname, date_of_birth) VALUES (?, ?, ?)");
            pr.setLong(1, entity.getId());
            pr.setString(2, entity.getNickname());
            pr.setString(3, entity.getDateOfBirth());
            pr.executeUpdate();

            System.out.println("Success");

        } catch (SQLException sqlEx) {
            sqlEx.printStackTrace();
        } finally {
            closeAll();
        }

    }

    @Override
    public void updateEntity(AnimalsModel entity) {

        try {
            PreparedStatement pr = getPreparedStatement("UPDATE animals SET neekname = ? WHERE id = ?");
            pr.setString(1,entity.getNickname());
            pr.setLong(2, entity.getId());

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
            PreparedStatement pr = getPreparedStatement("DELETE FROM animals WHERE id = ?");
            pr.setLong(1, id);

            pr.executeUpdate();

            System.out.println("Success");

        } catch (SQLException sqlEx) {
            sqlEx.printStackTrace();
        } finally {
            closeAll();
        }
    }
    @Override
    public List<AnimalsModel> getAllAnimals() {
        List<AnimalsModel> animalsModelList = new ArrayList<>();
        try {
            PreparedStatement pr = getPreparedStatement("SELECT * FROM animals");
            ResultSet rs = pr.executeQuery();
            while (rs.next()) {
                AnimalsModel animalsModelToAdd = new AnimalsModel();
                animalsModelToAdd.setId(rs.getLong("id"));
                animalsModelToAdd.setNickname(rs.getNString("neekname"));
                animalsModelToAdd.setDateOfBirth(rs.getString("date_of_birth"));
                animalsModelList.add(animalsModelToAdd);

            }
            LOGGER.info(animalsModelList.toString());
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return animalsModelList;
    }

}
