package com.solvd.zoo.models;

import com.solvd.zoo.dao.jdbs.mysql.EmployeesDao;
import com.solvd.zoo.dao.jdbs.mysql.ProvidersDao;

import java.util.List;

public class GoodsModel {
    private long id;
    private String name;
    private List<EmployeesModel> employeesModelList;
    private List<ProvidersModel> providersModelList;

    public GoodsModel() {
    }

    public GoodsModel(long id, String name, List<EmployeesModel> employeesModelList, List<ProvidersModel> providersModelList) {
        this.id = id;
        this.name = name;
        this.employeesModelList = employeesModelList;
        this.providersModelList = providersModelList;
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

    public List<ProvidersModel> getProvidersModelList() {
        return providersModelList;
    }

    public void setProvidersModelList(List<ProvidersModel> providersModelList) {
        this.providersModelList = providersModelList;
    }
}
