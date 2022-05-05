package com.solvd.zoo.dao.jdbs.mysql;

import java.util.Date;

public class TicketsDao {
    private long id;
    private int price;
    private boolean isActivate;
    private Date dateOfVisit = new Date();

    public TicketsDao() {
    }

    public TicketsDao(long id, int price, boolean isActivate, Date dateOfVisit) {
        this.id = id;
        this.price = price;
        this.isActivate = isActivate;
        this.dateOfVisit = dateOfVisit;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public boolean isActivate() {
        return isActivate;
    }

    public void setActivate(boolean activate) {
        isActivate = activate;
    }

    public Date getDateOfVisit() {
        return dateOfVisit;
    }

    public void setDateOfVisit(Date dateOfVisit) {
        this.dateOfVisit = dateOfVisit;
    }
}
