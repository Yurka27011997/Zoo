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
}
