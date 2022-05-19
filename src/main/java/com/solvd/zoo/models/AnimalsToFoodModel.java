package com.solvd.zoo.models;

public class AnimalsToFoodModel {
    private int id;
    private AnimalsModel animalsModel;
    private FoodModel foodModel;

    public AnimalsToFoodModel() {
    }
    public AnimalsToFoodModel(int id, AnimalsModel animalsModel, FoodModel foodModel) {
        this.id = id;
        this.animalsModel = animalsModel;
        this.foodModel = foodModel;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public AnimalsModel getAnimalsModel() {
        return animalsModel;
    }
    public void setAnimalsModel(AnimalsModel animalsModel) {
        this.animalsModel = animalsModel;
    }
    public FoodModel getFoodModel() {
        return foodModel;
    }
    public void setFoodModel(FoodModel foodModel) {
        this.foodModel = foodModel;
    }
}
