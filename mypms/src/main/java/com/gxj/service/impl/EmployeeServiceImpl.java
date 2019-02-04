package com.gxj.service.impl;

import com.gxj.mapper.EmployeeMapper;
import com.gxj.pojo.Employee;
import com.gxj.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class EmployeeServiceImpl implements EmployeeService {

    @Autowired
    private EmployeeMapper employeeMapper;

    @Override
    public List<Employee> findList() {
        return employeeMapper.findList();
    }
}
