package com.solvd.zoo.models;

import java.util.Date;

public class TicketsModel {
    private long id;
    private int price;
    private boolean isActivate;
    private String dateOfVisit;

    public TicketsModel() {
    }

    public TicketsModel(long id, int price, boolean isActivate, String dateOfVisit) {
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

    public String getDateOfVisit() {

        return dateOfVisit;
    }

    public void setDateOfVisit(String dateOfVisit) {

        this.dateOfVisit = dateOfVisit;
    }

    @Override
    public String toString() {
        return "TicketsModel{" +
                "id= " + id +
                ", price= " + price +
                ", isActivate= " + isActivate +
                ", dateOfVisit= '" + dateOfVisit + '\'' +
                '}';
    }
}
