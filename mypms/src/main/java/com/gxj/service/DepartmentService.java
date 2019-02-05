package com.gxj.service;

import com.gxj.pojo.Department;
import com.gxj.vo.PageBean;

import java.util.List;
import java.util.Map;

public interface DepartmentService {

    /**
     * 集合查询
     * @return
     */
    public List<Department> findList();


    /**
     * 分页查询
     * @param currentPage
     * @param pageSize
     * @return
     */
    public PageBean findPageBean(Map map);

    /**
     * 添加
     * @param department
     */
    public void insert(Department department);


    /**
     * 根据id查
     * @param id
     * @return
     */
    public Department findOne(Integer id);


    /**
     * 修改部门
     * @param department
     */
    public void update(Department department);
}
