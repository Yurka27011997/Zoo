package com.solvd.zoo.dao.jdbs.mysql;

import java.util.List;

public class PositionsDao {
    private long id;
    private String name;
    private List<EmployeesDao> employeesDaoList;

    public PositionsDao() {
    }

    public PositionsDao(long id, String name, List<EmployeesDao> employeesDaoList) {
        this.id = id;
        this.name = name;
        this.employeesDaoList = employeesDaoList;
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
}
