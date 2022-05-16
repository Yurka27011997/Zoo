package com.solvd.zoo.dao.jdbs.mysql;

import com.solvd.zoo.dao.IAviariesDao;
import com.solvd.zoo.models.AnimalsModel;
import com.solvd.zoo.models.AviariesModel;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class AviariesDao extends AbstractDao implements IAviariesDao {
    private static final Logger LOGGER = LogManager.getLogger(AviariesDao.class);

    @Override
    public AviariesModel getEntityById(long id) {
        AviariesModel aviariesModel = new AviariesModel();
        try {

            PreparedStatement pr = getPreparedStatement("SELECT * FROM aviaries WHERE id = ? ");
            pr.setLong(1, id);
            ResultSet rs = pr.executeQuery();

            while (rs.next()) {
                aviariesModel.setId(rs.getInt("id"));
                aviariesModel.setNumber(rs.getInt("number"));

            }

        } catch (SQLException sqlEx) {
            sqlEx.printStackTrace();
        } finally {
            closeAll();
        }
        return aviariesModel;


    }

    @Override
    public void saveEntity(AviariesModel entity) {
        try {
            PreparedStatement pr = getPreparedStatement("INSERT INTO aviaries (id, number) VALUES (?, ?)");
            pr.setLong(1, entity.getId());
            pr.setInt(2, entity.getNumber());
            pr.executeUpdate();

            System.out.println("Success");

        } catch (SQLException sqlEx) {
            sqlEx.printStackTrace();
        } finally {
            closeAll();
        }

    }

    @Override
    public void updateEntity(AviariesModel entity) {
        try {
            PreparedStatement pr = getPreparedStatement("UPDATE aviaries SET number = ? WHERE id = ?");
            pr.setInt(1,entity.getNumber());
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
            PreparedStatement pr = getPreparedStatement("DELETE FROM aviaries WHERE id = ?");
            pr.setLong(1, id);

            pr.executeUpdate();

            System.out.println("Success");

        } catch (SQLException sqlEx) {
            sqlEx.printStackTrace();
        } finally {
            closeAll();
        }


    }

    public List<AviariesModel> getAllAviaries() {
        List<AviariesModel> aviariesModelList = new ArrayList<>();
        try {
            PreparedStatement pr = getPreparedStatement("SELECT * FROM aviaries");
            ResultSet rs = pr.executeQuery();
            while (rs.next()) {
                AviariesModel aviariesModelToAdd = new AviariesModel();
                aviariesModelToAdd.setId(rs.getLong("id"));
                aviariesModelToAdd.setNumber(rs.getInt("number"));
                aviariesModelList.add(aviariesModelToAdd);

            }
            LOGGER.info(aviariesModelList.toString());
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return aviariesModelList;
    }

}
