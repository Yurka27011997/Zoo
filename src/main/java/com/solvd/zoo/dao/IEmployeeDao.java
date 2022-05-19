package com.solvd.zoo.dao;

import com.solvd.zoo.models.EmployeesModel;

import java.util.List;

public interface IEmployeeDao extends IBaseDao <EmployeesModel> {
    List<EmployeesModel> getAllEmployees();
}
