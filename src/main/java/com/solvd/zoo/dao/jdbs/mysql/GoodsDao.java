package com.solvd.zoo.dao.jdbs.mysql;

import com.solvd.zoo.dao.IGoodsDao;
import com.solvd.zoo.models.AnimalsModel;
import com.solvd.zoo.models.GoodsModel;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

public class GoodsDao extends AbstractDao implements IGoodsDao {

    @Override
    public GoodsModel getEntityById(long id) {
        GoodsModel goodsModel = new GoodsModel();
        try {

            PreparedStatement pr = getPreparedStatement("SELECT * FROM goods WHERE id = ? ");
            pr.setLong(1, id);
            ResultSet rs = pr.executeQuery();

            while (rs.next()) {
                goodsModel.setId(rs.getInt("id"));
                goodsModel.setName(rs.getNString("name"));

            }

        } catch (SQLException sqlEx) {
            sqlEx.printStackTrace();
        } finally {
            closeAll();
        }
        return goodsModel;



    }

    @Override
    public void saveEntity(GoodsModel entity) {
        try {
            PreparedStatement pr = getPreparedStatement("INSERT INTO goods (id, name) VALUES (?, ?)");
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
    public void updateEntity(GoodsModel entity) {
        try {
            PreparedStatement pr = getPreparedStatement("UPDATE goods SET name = ? WHERE id = ?");
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
