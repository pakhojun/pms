package com.gxj.service;

import com.gxj.pojo.Employee;

import java.util.List;

public interface EmployeeService {

    /**
     * 查询集合
     * @return
     */
    public List<Employee> findList();
}
