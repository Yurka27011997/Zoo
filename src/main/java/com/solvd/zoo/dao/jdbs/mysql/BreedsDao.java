package com.solvd.zoo.dao.jdbs.mysql;

import com.solvd.zoo.dao.IBreedsDao;
import com.solvd.zoo.models.BreedsModel;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class BreedsDao extends AbstractDao implements IBreedsDao {
    private static final Logger LOGGER = LogManager.getLogger(BreedsDao.class);

    @Override
    public BreedsModel getEntityById(long id) {

        BreedsModel breedsModel = new BreedsModel();
        try {

            PreparedStatement pr = getPreparedStatement("SELECT * FROM breeds WHERE id = ? ");
            pr.setLong(1, id);
            ResultSet rs = pr.executeQuery();

            while (rs.next()) {
                breedsModel.setId(rs.getInt("id"));
                breedsModel.setName(rs.getString("name"));

            }

        } catch (SQLException sqlEx) {
            sqlEx.printStackTrace();
        } finally {
            closeAll();
        }
        return breedsModel;


    }

    @Override
    public void saveEntity(BreedsModel entity) {
        try {
            PreparedStatement pr = getPreparedStatement("INSERT INTO breeds (id, name) VALUES (?, ?)");
            pr.setLong(1, entity.getId());
            pr.setString(2, entity.getName());
            pr.executeUpdate();

            System.out.println("Success");

        } catch (SQLException sqlEx) {
            sqlEx.printStackTrace();
        } finally {
            closeAll();
        }

    }

    @Override
    public void updateEntity(BreedsModel entity) {
        try {
            PreparedStatement pr = getPreparedStatement("UPDATE breeds SET name = ? WHERE id = ?");
            pr.setString(1,entity.getName());
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
            PreparedStatement pr = getPreparedStatement("DELETE FROM breeds WHERE id = ?");
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
    public List<BreedsModel> getAllBreeds() {
        List<BreedsModel> breedsModelList = new ArrayList<>();
        try {
            PreparedStatement pr = getPreparedStatement("SELECT * FROM breeds");
            ResultSet rs = pr.executeQuery();
            while (rs.next()) {
                BreedsModel breedsModelToAdd = new BreedsModel();
                breedsModelToAdd.setId(rs.getLong("id"));
                breedsModelToAdd.setName(rs.getString("name"));
                breedsModelList.add(breedsModelToAdd);

            }
            LOGGER.info(breedsModelList.toString());
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return breedsModelList;
    }
}

