package com.gxj.service.impl;

import com.gxj.mapper.DepartmentMapper;
import com.gxj.pojo.Department;
import com.gxj.service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class DepartmentServiceImpl implements DepartmentService {

    @Autowired
    private DepartmentMapper departmentMapper;

    @Override
    public List<Department> findList() {
        return departmentMapper.findList();
    }
}
