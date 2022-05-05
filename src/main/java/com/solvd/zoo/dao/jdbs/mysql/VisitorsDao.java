package com.solvd.zoo.dao.jdbs.mysql;

import java.util.List;

public class VisitorsDao {
    private long id;
    private String firstName;
    private String lastName;
    private String phone;
    List <TicketsDao> ticketsDaoList;

    public VisitorsDao() {
    }

    public VisitorsDao(long id, String firstName, String lastName, String phone, List<TicketsDao> ticketsDaoList) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.phone = phone;
        this.ticketsDaoList = ticketsDaoList;
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

    public List<TicketsDao> getTicketsDaoList() {
        return ticketsDaoList;
    }

    public void setTicketsDaoList(List<TicketsDao> ticketsDaoList) {
        this.ticketsDaoList = ticketsDaoList;
    }
}
