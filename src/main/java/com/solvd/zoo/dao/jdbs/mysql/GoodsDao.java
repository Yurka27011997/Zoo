package com.solvd.zoo.dao.jdbs.mysql;

import com.solvd.zoo.dao.IGoodsDao;
import com.solvd.zoo.models.GoodsModel;
import com.solvd.zoo.models.TypesOfGoodModel;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class GoodsDao extends AbstractDao implements IGoodsDao {
    private static final Logger LOGGER = LogManager.getLogger(GoodsDao.class);

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
    public List<GoodsModel> getGoodsByType() {
        List<GoodsModel> goodsBytype = new ArrayList<>();
        try {
            PreparedStatement pr = getPreparedStatement("SELECT goods.id, goods.name, types_of_good.id AS typeId, types_of_good.name AS typeName FROM goods LEFT JOIN types_of_good ON goods.type_id = types_of_good.id");
            ResultSet rs = pr.executeQuery();
            while (rs.next()) {
                TypesOfGoodModel typesOfGoodModel = new TypesOfGoodModel();
                GoodsModel goodsModelToAdd = new GoodsModel();
                goodsModelToAdd.setId(rs.getLong("id"));
                goodsModelToAdd.setName(rs.getNString("name"));
                typesOfGoodModel.setId(rs.getLong("typeId"));
                typesOfGoodModel.setName(rs.getString("typeName"));
                goodsModelToAdd.setTypesOfGoodModel(typesOfGoodModel);
                //goodsBytype.add(typesOfGoodModel);
                //goodsModelToAdd.typesOfGoodModel.setId(rs.getLong("id"));
               // goodsModelToAdd.typesOfGoodModel.setName(rs.getString("name"));
                goodsBytype.add(goodsModelToAdd);

            }
            LOGGER.info(goodsBytype.toString());
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return goodsBytype;
    }


}
