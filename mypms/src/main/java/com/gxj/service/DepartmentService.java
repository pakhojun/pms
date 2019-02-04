package com.gxj.service;

import com.gxj.pojo.Department;

import java.util.List;

public interface DepartmentService {

    /**
     * 集合查询
     * @return
     */
    public List<Department> findList();
}
