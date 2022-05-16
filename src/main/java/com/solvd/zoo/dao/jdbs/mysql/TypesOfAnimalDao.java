package com.solvd.zoo.dao.jdbs.mysql;

import com.solvd.zoo.dao.IAnimalsDao;
import com.solvd.zoo.dao.ITypesOfAnimalDao;
import com.solvd.zoo.models.AnimalsModel;
import com.solvd.zoo.models.ProvidersModel;
import com.solvd.zoo.models.TypesOfAnimalModel;


import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

public class TypesOfAnimalDao extends AbstractDao implements ITypesOfAnimalDao {


    @Override
    public TypesOfAnimalModel getEntityById(long id) {
        TypesOfAnimalModel typesOfAnimalModel = new TypesOfAnimalModel();
        try {

            PreparedStatement pr = getPreparedStatement("SELECT * FROM types_of_animal WHERE id = ? ");
            pr.setLong(1, id);
            ResultSet rs = pr.executeQuery();

            while (rs.next()) {
                typesOfAnimalModel.setId(rs.getInt("id"));
                typesOfAnimalModel.setName(rs.getNString("name"));

            }

        } catch (SQLException sqlEx) {
            sqlEx.printStackTrace();
        } finally {
            closeAll();
        }
        return typesOfAnimalModel;

    }

    @Override
    public void saveEntity(TypesOfAnimalModel entity) {
        try {
            PreparedStatement pr = getPreparedStatement("INSERT INTO types_of_animals (id, name) VALUES (?, ?)");
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
    public void updateEntity(TypesOfAnimalModel entity) {
        try {
            PreparedStatement pr = getPreparedStatement("UPDATE types_of_animal SET name = ? WHERE id = ?");
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
            PreparedStatement pr = getPreparedStatement("DELETE FROM types_of_animal WHERE id = ?");
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
