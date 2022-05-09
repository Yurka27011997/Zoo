package com.solvd.zoo;

import com.solvd.zoo.dao.jdbs.mysql.AnimalsDao;
import com.solvd.zoo.models.AnimalsModel;

import java.util.Date;

public class Main {
    public static void main(String[] args) {
        AnimalsDao animalsDao = new AnimalsDao();


//        AnimalsModel animalsModelSave = new AnimalsModel(1,"Stepan", "2021-03-30", null);
//        animalsDao.saveEntity(animalsModelSave);

          AnimalsModel animalsModelUpdate = new AnimalsModel(1,"Peter", "2021-03-30", null);
          animalsDao.updateEntity(animalsModelUpdate);
//
//        AnimalsModel animalsModelGet = animalsDao.getEntityById(1);
//        System.out.println(animalsModelGet.toString());


//
//        animalsDao.removeEntity(12);


    }


}
