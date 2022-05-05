package com.solvd.zoo.models;

import com.solvd.zoo.dao.jdbs.mysql.AnimalsDao;

import java.util.List;

public class TypesOfAnimalModel {
    private long id;
    private String name;
    private List<AnimalsModel> animalsModelList;

    public TypesOfAnimalModel() {
    }

    public TypesOfAnimalModel(long id, String name, List<AnimalsModel> animalsModelList) {
        this.id = id;
        this.name = name;
        this.animalsModelList = animalsModelList;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<AnimalsModel> getAnimalsModelList() {
        return animalsModelList;
    }

    public void setAnimalsModelList(List<AnimalsModel> animalsModelList) {
        this.animalsModelList = animalsModelList;
    }
}
