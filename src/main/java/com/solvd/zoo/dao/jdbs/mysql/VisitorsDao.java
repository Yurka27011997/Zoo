package com.solvd.zoo.dao.jdbs.mysql;

import com.solvd.zoo.dao.IVisitorsDao;
import com.solvd.zoo.models.EmployeesModel;
import com.solvd.zoo.models.VisitorsModel;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

public class VisitorsDao extends AbstractDao implements IVisitorsDao {

    @Override
    public VisitorsModel getEntityById(long id) {

        VisitorsModel visitorsModel = new VisitorsModel();
        try {

            PreparedStatement pr = getPreparedStatement("SELECT * FROM visitors WHERE id = ? ");
            pr.setLong(1, id);
            ResultSet rs = pr.executeQuery();

            while (rs.next()) {
                visitorsModel.setId(rs.getInt("id"));
                visitorsModel.setFirstName(rs.getString("first_name"));
                visitorsModel.setLastName(rs.getString("last_name"));
                visitorsModel.setPhone(rs.getString("phone"));

            }

        } catch (SQLException sqlEx) {
            sqlEx.printStackTrace();
        } finally {
            closeAll();
        }
        return visitorsModel;


    }

    @Override
    public void saveEntity(VisitorsModel entity) {
        try {
            PreparedStatement pr = getPreparedStatement("INSERT INTO visitors (id, first_name, last_name, phone) VALUES (?, ?, ?, ?)");
            pr.setLong(1, entity.getId());
            pr.setString(2, entity.getFirstName());
            pr.setString(3, entity.getLastName());
            pr.setString(4, entity.getPhone());
            pr.executeUpdate();

            System.out.println("Success");

        } catch (SQLException sqlEx) {
            sqlEx.printStackTrace();
        } finally {
            closeAll();
        }

    }

    @Override
    public void updateEntity(VisitorsModel entity) {
        try {
            PreparedStatement pr = getPreparedStatement("UPDATE visitors SET first_name = ?, last_name = ? WHERE id = ?");
            pr.setString(1,entity.getFirstName());
            pr.setString(2,entity.getLastName());
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
            PreparedStatement pr = getPreparedStatement("DELETE FROM visitors WHERE id = ?");
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
