package com.solvd.zoo.dao.jdbs.mysql;

import com.solvd.zoo.dao.IPositionsDao;
import com.solvd.zoo.models.OperationsModel;
import com.solvd.zoo.models.PositionsModel;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

public class PositionsDao extends AbstractDao implements IPositionsDao {

    @Override
    public PositionsModel getEntityById(long id) {

        PositionsModel positionsModel = new PositionsModel();
        try {

            PreparedStatement pr = getPreparedStatement("SELECT * FROM positions WHERE id = ? ");
            pr.setLong(1, id);
            ResultSet rs = pr.executeQuery();

            while (rs.next()) {
                positionsModel.setId(rs.getInt("id"));
                positionsModel.setName(rs.getNString("name"));

            }

        } catch (SQLException sqlEx) {
            sqlEx.printStackTrace();
        } finally {
            closeAll();
        }
        return positionsModel;

    }

    @Override
    public void saveEntity(PositionsModel entity) {

        try {
            PreparedStatement pr = getPreparedStatement("INSERT INTO positions (id, name) VALUES (?, ?)");
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
    public void updateEntity(PositionsModel entity) {
        try {
            PreparedStatement pr = getPreparedStatement("UPDATE positions SET name = ? WHERE id = ?");
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
            PreparedStatement pr = getPreparedStatement("DELETE FROM positions WHERE id = ?");
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
