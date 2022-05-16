package com.solvd.zoo.models;

import com.solvd.zoo.dao.jdbs.mysql.AnimalsToFoodDao;

import java.util.List;

public class FoodModel {
    private long id;
    private String name;
    private float weight;
    private List<AnimalsToFoodModel> animalsToFoodModelList;

    public FoodModel() {
    }

    public FoodModel(long id, String name, float weight, List<AnimalsToFoodModel> animalsToFoodModelList) {
        this.id = id;
        this.name = name;
        this.weight = weight;
        this.animalsToFoodModelList = animalsToFoodModelList;
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

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    public List<AnimalsToFoodModel> getAnimalsToFoodModelList() {
        return animalsToFoodModelList;
    }

    public void setAnimalsToFoodModelList(List<AnimalsToFoodModel> animalsToFoodModelList) {
        this.animalsToFoodModelList = animalsToFoodModelList;
    }

    @Override
    public String toString() {
        return "FoodModel{" +
                "id= " + id +
                ", name= '" + name + '\'' +
                ", weight= " + weight +
                ", animalsToFoodModelList= " + animalsToFoodModelList +
                '}';
    }
}
