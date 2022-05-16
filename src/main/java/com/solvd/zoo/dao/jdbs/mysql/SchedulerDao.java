package com.solvd.zoo.dao.jdbs.mysql;

import com.solvd.zoo.dao.ISchedulerDao;
import com.solvd.zoo.models.ProvidersModel;
import com.solvd.zoo.models.SchedulerModel;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;

public class SchedulerDao extends AbstractDao implements ISchedulerDao {

    @Override
    public SchedulerModel getEntityById(long id)
    {
        SchedulerModel schedulerModel = new SchedulerModel();
        try {

            PreparedStatement pr = getPreparedStatement("SELECT * FROM scheduler WHERE id = ? ");
            pr.setLong(1, id);
            ResultSet rs = pr.executeQuery();

            while (rs.next()) {
                schedulerModel.setId(rs.getInt("id"));
                schedulerModel.setDate(rs.getNString("date"));

            }

        } catch (SQLException sqlEx) {
            sqlEx.printStackTrace();
        } finally {
            closeAll();
        }
        return schedulerModel;
    }

    @Override
    public void saveEntity(SchedulerModel entity) {
        try {
            PreparedStatement pr = getPreparedStatement("INSERT INTO scheduler (id, date) VALUES (?, ?)");
            pr.setLong(1, entity.getId());
            pr.setString(2, entity.getDate());
            pr.executeUpdate();

            System.out.println("Success");

        } catch (SQLException sqlEx) {
            sqlEx.printStackTrace();
        } finally {
            closeAll();
        }

    }

    @Override
    public void updateEntity(SchedulerModel entity) {
        try {
            PreparedStatement pr = getPreparedStatement("UPDATE scheduler SET date = ? WHERE id = ?");
            pr.setString(1,entity.getDate());
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
            PreparedStatement pr = getPreparedStatement("DELETE FROM scheduler WHERE id = ?");
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
