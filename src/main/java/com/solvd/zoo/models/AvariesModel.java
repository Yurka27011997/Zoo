package com.solvd.zoo.models;

import com.solvd.zoo.dao.jdbs.mysql.AnimalsDao;
import com.solvd.zoo.dao.jdbs.mysql.SchedulerDao;

import java.util.List;

public class AvariesModel {
    private long id;
    private int number;
    private List<SchedulerModel> schedulerModelList;
    private List<AnimalsModel> animalsModelList;

    public AvariesModel() {
    }

    public AvariesModel(long id, int number, List<SchedulerModel> schedulerModelList, List<AnimalsModel> animalsModelList) {
        this.id = id;
        this.number = number;
        this.schedulerModelList = schedulerModelList;
        this.animalsModelList = animalsModelList;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public List<SchedulerModel> getSchedulerModelList() {
        return schedulerModelList;
    }

    public void setSchedulerModelList(List<SchedulerModel> schedulerModelList) {
        this.schedulerModelList = schedulerModelList;
    }

    public List<AnimalsModel> getAnimalsModelList() {
        return animalsModelList;
    }

    public void setAnimalsModelList(List<AnimalsModel> animalsModelList) {
        this.animalsModelList = animalsModelList;
    }
}
