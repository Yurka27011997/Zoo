package com.solvd.zoo.models;

import com.solvd.zoo.dao.jdbs.mysql.SchedulerDao;

import java.util.List;

public class OperationsModel {
    private long id;
    private String name;
    private List<SchedulerModel> schedulerModelList;

    public OperationsModel() {
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
    public List<SchedulerModel> getSchedulerModelList() {
        return schedulerModelList;
    }
    public void setSchedulerModelList(List<SchedulerModel> schedulerModelList) {
        this.schedulerModelList = schedulerModelList;
    }

    @Override
    public String toString() {
        return "OperationsModel{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", schedulerModelList=" + schedulerModelList +
                '}';
    }
}
