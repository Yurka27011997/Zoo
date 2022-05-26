package com.solvd.zoo.dao;

import com.solvd.zoo.models.AviariesModel;

import java.util.List;

public interface IAviariesDao extends IBaseDao <AviariesModel> {
    List<AviariesModel> getAllAviaries();


    List<AviariesModel> getAllAviariesMyBatis();
}
