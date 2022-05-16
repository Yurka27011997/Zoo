package com.solvd.zoo.dao.jdbs.mysql;

import com.solvd.zoo.dao.IProvidersDao;
import com.solvd.zoo.models.PositionsModel;
import com.solvd.zoo.models.ProvidersModel;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ProvidersDao extends AbstractDao implements IProvidersDao {
   @Override
   public ProvidersModel getEntityById(long id) {

      ProvidersModel providersModel = new ProvidersModel();
      try {

         PreparedStatement pr = getPreparedStatement("SELECT * FROM providers WHERE id = ? ");
         pr.setLong(1, id);
         ResultSet rs = pr.executeQuery();

         while (rs.next()) {
            providersModel.setId(rs.getInt("id"));
            providersModel.setName(rs.getNString("name"));

         }

      } catch (SQLException sqlEx) {
         sqlEx.printStackTrace();
      } finally {
         closeAll();
      }
      return providersModel;


   }

   @Override
   public void saveEntity(ProvidersModel entity) {
      try {
         PreparedStatement pr = getPreparedStatement("INSERT INTO providers (id, name) VALUES (?, ?)");
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
   public void updateEntity(ProvidersModel entity) {
      try {
         PreparedStatement pr = getPreparedStatement("UPDATE providers SET name = ? WHERE id = ?");
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
         PreparedStatement pr = getPreparedStatement("DELETE FROM providers WHERE id = ?");
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
