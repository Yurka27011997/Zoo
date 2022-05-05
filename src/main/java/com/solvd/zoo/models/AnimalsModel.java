package com.solvd.zoo.models;

import com.solvd.zoo.dao.jdbs.mysql.AnimalsToFoodDao;

import java.util.Date;
import java.util.List;

public class AnimalsModel {
    private long id;
    private String nickname;
    private Date dateOfBirth = new Date();
    private List<AnimalsToFoodModel> animalsToFoodModelList;

    public AnimalsModel() {
    }

    public AnimalsModel(long id, String nickname, Date dateOfBirth, List<AnimalsToFoodModel> animalsToFoodModelList) {
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

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public List<AnimalsToFoodModel> getAnimalsToFoodModelList() {
        return animalsToFoodModelList;
    }

    public void setAnimalsToFoodModelList(List<AnimalsToFoodModel> animalsToFoodModelList) {
        this.animalsToFoodModelList = animalsToFoodModelList;
    }
}
