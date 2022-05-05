package com.solvd.zoo.dao.jdbs.mysql;

import java.util.List;

public class AvariesDao {
    private long id;
    private int number;
    private List<SchedulerDao> schedulerDaoList;
    private List<AnimalsDao> animalsDaoList;

    public AvariesDao() {
    }

    public AvariesDao(long id, int number, List<SchedulerDao> schedulerDaoList, List<AnimalsDao> animalsDaoList) {
        this.id = id;
        this.number = number;
        this.schedulerDaoList = schedulerDaoList;
        this.animalsDaoList = animalsDaoList;
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

    public List<SchedulerDao> getSchedulerDaoList() {


        return schedulerDaoList;
    }

    public void setSchedulerDaoList(List<SchedulerDao> schedulerDaoList) {

        this.schedulerDaoList = schedulerDaoList;
    }

    public List<AnimalsDao> getAnimalsDaoList() {
        return animalsDaoList;
    }

    public void setAnimalsDaoList(List<AnimalsDao> animalsDaoList) {
        this.animalsDaoList = animalsDaoList;
    }
}
