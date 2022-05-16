package com.solvd.zoo.models;

public class AnimalsToFoodModel {
    private int id;

    public AnimalsToFoodModel() {
    }

    public AnimalsToFoodModel(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    @Override
    public String toString() {
        return "AnimalsToFoodModel{ " +
                "id= " + id +
                '}';
    }
}
