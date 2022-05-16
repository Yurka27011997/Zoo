package com.solvd.zoo.dao.jdbs.mysql;

import com.solvd.zoo.dao.ITypesOfGoodDao;
import com.solvd.zoo.models.ProvidersModel;
import com.solvd.zoo.models.TypesOfGoodModel;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

public class TypesOfGoodDao extends AbstractDao implements ITypesOfGoodDao {
   @Override
   public TypesOfGoodModel getEntityById(long id) {

      TypesOfGoodModel typesOfGoodModel = new TypesOfGoodModel();
      try {

         PreparedStatement pr = getPreparedStatement("SELECT * FROM types_of_good WHERE id = ? ");
         pr.setLong(1, id);
         ResultSet rs = pr.executeQuery();

         while (rs.next()) {
            typesOfGoodModel.setId(rs.getInt("id"));
            typesOfGoodModel.setName(rs.getNString("name"));

         }

      } catch (SQLException sqlEx) {
         sqlEx.printStackTrace();
      } finally {
         closeAll();
      }
      return typesOfGoodModel;

   }

   @Override
   public void saveEntity(TypesOfGoodModel entity) {
      try {
         PreparedStatement pr = getPreparedStatement("INSERT INTO types_of_good (id, name) VALUES (?, ?)");
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
   public void updateEntity(TypesOfGoodModel entity) {
      try {
         PreparedStatement pr = getPreparedStatement("UPDATE types_of_good SET name = ? WHERE id = ?");
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
         PreparedStatement pr = getPreparedStatement("DELETE FROM types_of_good WHERE id = ?");
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

