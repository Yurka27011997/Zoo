package com.solvd.zoo.dao.jdbs.mysql;

import java.util.List;

public class OperationsDao {
    private long id;
    private String name;
    private List<SchedulerDao> schedulerDaoList;

    public OperationsDao() {
    }

    public OperationsDao(long id, String name, List<SchedulerDao> schedulerDaoList) {
        this.id = id;
        this.name = name;
        this.schedulerDaoList = schedulerDaoList;
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

    public List<SchedulerDao> getSchedulerDaoList() {
        return schedulerDaoList;
    }

    public void setSchedulerDaoList(List<SchedulerDao> schedulerDaoList) {
        this.schedulerDaoList = schedulerDaoList;
    }
}
