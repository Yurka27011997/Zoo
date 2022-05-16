package com.solvd.zoo.dao.jdbs.mysql;

import com.solvd.zoo.dao.IEmployeeDao;
import com.solvd.zoo.models.AnimalsModel;
import com.solvd.zoo.models.BreedsModel;
import com.solvd.zoo.models.EmployeesModel;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class EmployeesDao extends AbstractDao implements IEmployeeDao {
    private static final Logger LOGGER = LogManager.getLogger(EmployeesModel.class);

    @Override
    public EmployeesModel getEntityById(long id) {
        EmployeesModel employeesModel = new EmployeesModel();
        try {

            PreparedStatement pr = getPreparedStatement("SELECT * FROM employees WHERE id = ? ");
            pr.setLong(1, id);
            ResultSet rs = pr.executeQuery();

            while (rs.next()) {
                employeesModel.setId(rs.getInt("id"));
                employeesModel.setFirstName(rs.getString("first_name"));
                employeesModel.setLastName(rs.getString("last_name"));
                employeesModel.setEmail(rs.getString("email"));
                employeesModel.setPhone(rs.getString("phone"));

            }

        } catch (SQLException sqlEx) {
            sqlEx.printStackTrace();
        } finally {
            closeAll();
        }
        return employeesModel;



    }

    @Override
    public void saveEntity(EmployeesModel entity) {
        try {
            PreparedStatement pr = getPreparedStatement("INSERT INTO employees (id, first_name, last_name, email, phone) VALUES (?, ?, ?, ?, ?)");
            pr.setLong(1, entity.getId());
            pr.setString(2, entity.getFirstName());
            pr.setString(3, entity.getLastName());
            pr.setString(4, entity.getEmail());
            pr.setString(5, entity.getPhone());
            pr.executeUpdate();

            System.out.println("Success");

        } catch (SQLException sqlEx) {
            sqlEx.printStackTrace();
        } finally {
            closeAll();
        }

    }

    @Override
    public void updateEntity(EmployeesModel entity) {
        try {
            PreparedStatement pr = getPreparedStatement("UPDATE employees SET first_name = ?, last_name = ? WHERE id = ?");
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
            PreparedStatement pr = getPreparedStatement("DELETE FROM employees WHERE id = ?");
            pr.setLong(1, id);

            pr.executeUpdate();

            System.out.println("Success");

        } catch (SQLException sqlEx) {
            sqlEx.printStackTrace();
        } finally {
            closeAll();
        }

    }

    public List<EmployeesModel> getAllEmployees() {
        List<EmployeesModel> employeesModelList = new ArrayList<>();
        try {
            PreparedStatement pr = getPreparedStatement("SELECT * FROM employees");
            ResultSet rs = pr.executeQuery();
            while (rs.next()) {
                EmployeesModel employeesModelToAdd = new EmployeesModel();
                employeesModelToAdd.setId(rs.getInt("id"));
                employeesModelToAdd.setFirstName(rs.getString("first_name"));
                employeesModelToAdd.setLastName(rs.getString("last_name"));
                employeesModelToAdd.setEmail(rs.getString("email"));
                employeesModelToAdd.setPhone(rs.getString("phone"));
                employeesModelList.add(employeesModelToAdd);

            }
            LOGGER.info(employeesModelList.toString());
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return employeesModelList;
    }
}
