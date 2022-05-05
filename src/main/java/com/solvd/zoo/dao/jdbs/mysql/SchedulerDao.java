package com.solvd.zoo.dao.jdbs.mysql;

import java.util.Date;

public class SchedulerDao {
    private long id;
    private Date date = new Date();

    public SchedulerDao() {
    }

    public SchedulerDao(long id, Date date) {
        this.id = id;
        this.date = date;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}
