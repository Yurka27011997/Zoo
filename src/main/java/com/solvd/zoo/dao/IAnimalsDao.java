package com.solvd.zoo.dao;

import com.solvd.zoo.models.AnimalsModel;

import java.util.List;

public interface IAnimalsDao extends IBaseDao <AnimalsModel> {
    List<AnimalsModel> getAllAnimals();
}
