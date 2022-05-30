package com.solvd.zoo.models;

import com.solvd.zoo.dao.jdbs.mysql.AnimalsToFoodDao;

import java.util.Date;
import java.util.List;

public class AnimalsModel {
    private long id;
    private String nickname;
    private String dateOfBirth;
    private List<AnimalsToFoodModel> animalsToFoodModelList;

    public AnimalsModel() {
    }

    public AnimalsModel(String nickname, String dateOfBirth, List<AnimalsToFoodModel> animalsToFoodModelList) {
        this.nickname = nickname;
        this.dateOfBirth = dateOfBirth;
        this.animalsToFoodModelList = animalsToFoodModelList;
    }

    public AnimalsModel(long id, String nickname, String dateOfBirth, List<AnimalsToFoodModel> animalsToFoodModelList) {
        this.id = id;
        this.nickname = nickname;
        this.dateOfBirth = dateOfBirth;
        this.animalsToFoodModelList = animalsToFoodModelList;
    }

    public long getId() {
        return id;
    }
    public void setId(long id) {

        this.id = id;
    }
    public String getNickname() {

        return nickname;
    }
    public void setNickname(String nickname) {

        this.nickname = nickname;
    }
    public String getDateOfBirth() {

        return dateOfBirth;
    }
    public void setDateOfBirth(String dateOfBirth) {

        this.dateOfBirth = dateOfBirth;
    }
    public List<AnimalsToFoodModel> getAnimalsToFoodModelList() {

        return animalsToFoodModelList;
    }
    public void setAnimalsToFoodModelList(List<AnimalsToFoodModel> animalsToFoodModelList) {
        this.animalsToFoodModelList = animalsToFoodModelList;
    }

    @Override
    public String toString() {
        return "AnimalsModel{" +
                "id= " + id +
                ", nickname= '" + nickname + '\'' +
                ", dateOfBirth= " + dateOfBirth +
                ", animalsToFoodModelList= " + animalsToFoodModelList +
                '}';
    }
}
