package com.gxj.mapper;

import com.gxj.pojo.Department;

import java.util.List;

public interface DepartmentMapper {

    /**
     * 查询列表
     * @return
     */
    public List<Department> findList();

}
