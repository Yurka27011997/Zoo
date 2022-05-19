package com.solvd.zoo.dao;

import com.solvd.zoo.models.BreedsModel;

import java.util.List;

public interface IBreedsDao extends IBaseDao <BreedsModel> {
    List<BreedsModel> getAllBreeds();
}
