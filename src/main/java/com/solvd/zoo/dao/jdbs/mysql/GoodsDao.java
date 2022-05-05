package com.solvd.zoo.dao.jdbs.mysql;

import java.util.List;

public class GoodsDao {
    private long id;
    private String name;
    private List<EmployeesDao> employeesDaoList;
    private List<ProvidersDao> providersDaoList;

    public GoodsDao() {
    }

    public GoodsDao(long id, String name, List<EmployeesDao> employeesDaoList, List<ProvidersDao> providersDaoList) {
        this.id = id;
        this.name = name;
        this.employeesDaoList = employeesDaoList;
        this.providersDaoList = providersDaoList;
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

    public List<EmployeesDao> getEmployeeDaoList() {
        return employeesDaoList;
    }

    public void setEmployeeDaoList(List<EmployeesDao> employeesDaoList) {
        this.employeesDaoList = employeesDaoList;
    }

    public List<ProvidersDao> getProvidersDaoList() {
        return providersDaoList;
    }

    public void setProvidersDaoList(List<ProvidersDao> providersDaoList) {
        this.providersDaoList = providersDaoList;
    }
}
