package com.solvd.zoo.dao.jdbs.mysql;

import java.util.List;

public class EmployeesDao {
    private long id;
    private String firstName;
    private String lastName;
    private String email;
    private String phone;
    private List<SchedulerDao> schedulerDaoList;
    private List<TicketsDao> ticketsDaoList;

    public EmployeesDao() {
    }

    public EmployeesDao(long id, String firstName, String lastName, String email, String phone, List<SchedulerDao> schedulerDaoDaoList, List<TicketsDao> ticketsDaoList) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.phone = phone;
        this.schedulerDaoList = schedulerDaoDaoList;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public List<SchedulerDao> getSchedulerDaoList() {
        return schedulerDaoList;
    }

    public void setSchedulerDaoList(List<SchedulerDao> schedulerDaoList) {
        this.schedulerDaoList = schedulerDaoList;
    }

    public List<TicketsDao> getTicketsDaoList() {
        return ticketsDaoList;
    }

    public void setTicketsDaoList(List<TicketsDao> ticketsDaoList) {
        this.ticketsDaoList = ticketsDaoList;
    }
}
