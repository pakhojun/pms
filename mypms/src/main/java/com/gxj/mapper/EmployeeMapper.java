package com.gxj.mapper;

import com.gxj.pojo.Employee;

import java.util.List;

public interface EmployeeMapper {

    /**
     * 查询集合
     * @return
     */
    public List<Employee> findList();

}
