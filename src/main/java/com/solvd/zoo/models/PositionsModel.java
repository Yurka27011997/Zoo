package com.solvd.zoo.models;

import com.solvd.zoo.dao.jdbs.mysql.EmployeesDao;

import java.util.List;

public class PositionsModel {
    private long id;
    private String name;
    private List<EmployeesModel> employeesModelList;

    public PositionsModel() {
    }

    public PositionsModel(long id, String name, List<EmployeesModel> employeesModelList) {
        this.id = id;
        this.name = name;
        this.employeesModelList = employeesModelList;
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

    public List<EmployeesModel> getEmployeesModelList() {
        return employeesModelList;
    }

    public void setEmployeesModelList(List<EmployeesModel> employeesModelList) {
        this.employeesModelList = employeesModelList;
    }

    @Override
    public String toString() {
        return "PositionsModel{" +
                "id= " + id +
                ", name= '" + name + '\'' +
                ", employeesModelList= " + employeesModelList +
                '}';
    }
}
