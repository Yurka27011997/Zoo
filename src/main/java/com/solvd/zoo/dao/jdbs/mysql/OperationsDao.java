package com.solvd.zoo.dao.jdbs.mysql;

import com.solvd.zoo.dao.IOperationsDao;
import com.solvd.zoo.models.GoodsModel;
import com.solvd.zoo.models.OperationsModel;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

public class OperationsDao extends AbstractDao implements IOperationsDao {

    @Override
    public OperationsModel getEntityById(long id) {

        OperationsModel operationsModel = new OperationsModel();
        try {

            PreparedStatement pr = getPreparedStatement("SELECT * FROM operations WHERE id = ? ");
            pr.setLong(1, id);
            ResultSet rs = pr.executeQuery();

            while (rs.next()) {
                operationsModel.setId(rs.getInt("id"));
                operationsModel.setName(rs.getNString("name"));

            }

        } catch (SQLException sqlEx) {
            sqlEx.printStackTrace();
        } finally {
            closeAll();
        }
        return operationsModel;




    }

    @Override
    public void saveEntity(OperationsModel entity) {
        try {
            PreparedStatement pr = getPreparedStatement("INSERT INTO operations (id, name) VALUES (?, ?)");
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
    public void updateEntity(OperationsModel entity) {
        try {
            PreparedStatement pr = getPreparedStatement("UPDATE operations SET name = ? WHERE id = ?");
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
            PreparedStatement pr = getPreparedStatement("DELETE FROM goods WHERE id = ?");
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
