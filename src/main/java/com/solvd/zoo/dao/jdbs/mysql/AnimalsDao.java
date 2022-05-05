package com.solvd.zoo.dao.jdbs.mysql;

import java.util.Date;
import java.util.List;

public class AnimalsDao {
    private long id;
    private String neekname;
    private Date dateOfBirth = new Date();
    private List<AnimalsToFoodDao> animalsToFoodDaoList;

    public AnimalsDao() {
    }

    public AnimalsDao(long id, String neekname, Date dateOfBirth, List<AnimalsToFoodDao> animalsToFoodDaoList) {
        this.id = id;
        this.neekname = neekname;
        this.dateOfBirth = dateOfBirth;
        this.animalsToFoodDaoList = animalsToFoodDaoList;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNeekname() {
        return neekname;
    }

    public void setNeekname(String neekname) {
        this.neekname = neekname;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public List<AnimalsToFoodDao> getAnimalsToFoodDaoList() {
        return animalsToFoodDaoList;
    }

    public void setAnimalsToFoodDaoList(List<AnimalsToFoodDao> animalsToFoodDaoList) {
        this.animalsToFoodDaoList = animalsToFoodDaoList;
    }
}
