package com.solvd.zoo;

import com.solvd.zoo.dao.jdbs.mysql.*;
import com.solvd.zoo.models.AnimalsModel;
import com.solvd.zoo.models.AviariesModel;
import com.solvd.zoo.models.EmployeesModel;
import com.solvd.zoo.models.TypesOfGoodModel;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Main {
    private static final Logger LOGGER = LogManager.getLogger(Main.class);
    public static void main(String[] args) {


         GoodsDao goodsDao = new GoodsDao();
       goodsDao.getGoodsByType();
        //AnimalsDao
//       AnimalsDao animalsDao = new AnimalsDao();

      // AnimalsModel animalsModelGet = animalsDao.getEntityById(1);
      //  LOGGER.info(animalsModelGet.toString());
//        animalsDao.getAllAnimals();


//
//        AnimalsModel animalsModelSave = new AnimalsModel(24,"Stepan", "2021-03-30", null);
//        animalsDao.saveEntity(animalsModelSave);
//
//        AnimalsModel animalsModelUpdate = new AnimalsModel(21,"Peter", "2021-03-30", null);
//        animalsDao.updateEntity(animalsModelUpdate);
//
//        animalsDao.removeEntity(21);

        // Animals_to_food:
//        AnimalsToFoodDao animalsToFoodDao = new AnimalsToFoodDao();
//        AnimalsToFoodModel animalsToFoodModelGet = animalsToFoodDao.getEntityById(1);
//        LOGGER.info(animalsToFoodModelGet.toString());

        //Avaries:
//        AviariesDao aviariesDao = new AviariesDao();
//        AviariesModel aviariesModelGet = aviariesDao.getEntityById(1);
//        LOGGER.info(aviariesModelGet.toString());
//
//        AviariesModel aviariesModelSave = new AviariesModel(24,22, null, null);
//        aviariesDao.saveEntity(aviariesModelSave);

//        //Employees
//        EmployeesDao employeesDao = new EmployeesDao();
//        EmployeesModel employeesModelGet = employeesDao.getEntityById(1);
//        LOGGER.info(employeesModelGet.toString());
//
////        EmployeesModel employeesModelSave = new EmployeesModel(6,"Peter", "Stetsiuk", "P.S@leoni.com", "+38099254681", null, null);
////        employeesDao.saveEntity(employeesModelSave);
//
//        EmployeesModel employeesModelUpdate = new EmployeesModel(6,"Alex", "Stetsiuk", "P.S@leoni.com", "+38099254681", null, null);
//        employeesDao.updateEntity(employeesModelUpdate);




    }


}
