package com.solvd.zoo.models;



import java.util.List;

public class EmployeesModel {
    private long id;
    private String firstName;
    private String lastName;
    private String email;
    private String phone;
    private List<SchedulerModel> schedulerModelList;
    private List<TicketsModel> ticketsModelList;

    public EmployeesModel() {
    }

    public EmployeesModel(long id, String firstName, String lastName, String email, String phone, List<SchedulerModel> schedulerModelList, List<TicketsModel> ticketsModelList) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.phone = phone;
        this.schedulerModelList = schedulerModelList;
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
    public List<SchedulerModel> getSchedulerModelList() {
        return schedulerModelList;
    }
    public void setSchedulerModelList(List<SchedulerModel> schedulerModelList) {
        this.schedulerModelList = schedulerModelList;
    }
    public List<TicketsModel> getTicketsModelList() {
        return ticketsModelList;
    }
    public void setTicketsModelList(List<TicketsModel> ticketsModelList) {
        this.ticketsModelList = ticketsModelList;
    }

    @Override
    public String toString() {
        return "EmployeesModel{" +
                "id= " + id +
                ", firstName= '" + firstName + '\'' +
                ", lastName= '" + lastName + '\'' +
                ", email= '" + email + '\'' +
                ", phone= '" + phone + '\'' +
                ", schedulerModelList= " + schedulerModelList +
                ", ticketsModelList= " + ticketsModelList +
                '}';
    }
}
