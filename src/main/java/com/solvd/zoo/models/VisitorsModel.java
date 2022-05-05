package com.solvd.zoo.models;

import com.solvd.zoo.dao.jdbs.mysql.TicketsDao;

import java.util.List;

public class VisitorsModel {
    private long id;
    private String firstName;
    private String lastName;
    private String phone;
    List<TicketsModel> ticketsModelList;

    public VisitorsModel() {
    }

    public VisitorsModel(long id, String firstName, String lastName, String phone, List<TicketsModel> ticketsModelList) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.phone = phone;
        this.ticketsModelList = ticketsModelList;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public List<TicketsModel> getTicketsModelList() {
        return ticketsModelList;
    }

    public void setTicketsModelList(List<TicketsModel> ticketsModelList) {
        this.ticketsModelList = ticketsModelList;
    }
}
