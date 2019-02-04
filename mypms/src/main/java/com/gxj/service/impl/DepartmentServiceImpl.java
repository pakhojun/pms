package com.gxj.service.impl;

import com.gxj.mapper.DepartmentMapper;
import com.gxj.pojo.Department;
import com.gxj.service.DepartmentService;
import com.gxj.vo.PageBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class DepartmentServiceImpl implements DepartmentService {

    @Autowired
    private DepartmentMapper departmentMapper;

    @Override
    public List<Department> findList() {
        return departmentMapper.findList();
    }


    @Override
    public PageBean findPageBean(Map map) {
        PageBean pageBean=new PageBean((Integer) map.get("currentPage"),(Integer) map.get("pageSize"));
        Integer count = departmentMapper.count((String)map.get("queryString"));
        pageBean.setTotalCount(count);
        List<Department> listLimit = departmentMapper.findListLimit(pageBean.getStartIndex(), pageBean.getPageSize(),(String)map.get("queryString"));
        pageBean.setData(listLimit);
        return pageBean;
    }

    @Override
    public void insert(Department department) {
        departmentMapper.insert(department);
    }
}
