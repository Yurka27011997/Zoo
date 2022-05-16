package com.solvd.zoo.dao.jdbs.mysql;

import com.solvd.zoo.dao.ITicketsDao;
import com.solvd.zoo.models.SchedulerModel;
import com.solvd.zoo.models.TicketsModel;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;

public class TicketsDao extends AbstractDao implements ITicketsDao {

    @Override
    public TicketsModel getEntityById(long id) {
        TicketsModel ticketsModel = new TicketsModel();
        try {

            PreparedStatement pr = getPreparedStatement("SELECT * FROM tickets WHERE id = ? ");
            pr.setLong(1, id);
            ResultSet rs = pr.executeQuery();

            while (rs.next()) {
                ticketsModel.setId(rs.getInt("id"));
                ticketsModel.setPrice(rs.getInt("price"));
                ticketsModel.setActivate(rs.getBoolean("is_activate"));
                ticketsModel.setDateOfVisit(rs.getString("date_of_visit"));

            }

        } catch (SQLException sqlEx) {
            sqlEx.printStackTrace();
        } finally {
            closeAll();
        }
        return ticketsModel;

    }

    @Override
    public void saveEntity(TicketsModel entity) {
        try {
            PreparedStatement pr = getPreparedStatement("INSERT INTO tickets (id, price, is_activate, date_of_visit) VALUES (?, ?, ?, ?)");
            pr.setLong(1, entity.getId());
            pr.setInt(2, entity.getPrice());
            pr.setBoolean(3, entity.isActivate());
            pr.setString(3, entity.getDateOfVisit());
            pr.executeUpdate();

            System.out.println("Success");

        } catch (SQLException sqlEx) {
            sqlEx.printStackTrace();
        } finally {
            closeAll();
        }


    }

    @Override
    public void updateEntity(TicketsModel entity) {
        try {
            PreparedStatement pr = getPreparedStatement("UPDATE tickets SET price = ? WHERE id = ?");
            pr.setInt(1,entity.getPrice());
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
            PreparedStatement pr = getPreparedStatement("DELETE FROM tickets WHERE id = ?");
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
