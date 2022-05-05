package com.solvd.zoo.dao.jdbs.mysql;

import java.util.List;

public class FoodDao {
    private long id;
    private String name;
    private float weight;
    private List<AnimalsToFoodDao> animalsToFoodDaoList;

    public FoodDao() {
    }

    public FoodDao(long id, String name, float weight, List<AnimalsToFoodDao> animalsToFoodDaoList) {
        this.id = id;
        this.name = name;
        this.weight = weight;
        this.animalsToFoodDaoList = animalsToFoodDaoList;
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

    public List<AnimalsToFoodDao> getAnimalsToFoodDaoList() {
        return animalsToFoodDaoList;
    }

    public void setAnimalsToFoodDaoList(List<AnimalsToFoodDao> animalsToFoodDaoList) {
        this.animalsToFoodDaoList = animalsToFoodDaoList;
    }

}
