package com.gxj.controller;

import com.gxj.pojo.Department;
import com.gxj.service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/department")
public class DepartmentController {

    @Autowired
    private DepartmentService departmentService;


    @RequestMapping("/findList")
    public List<Department> findList(){
        return  departmentService.findList();
    }

}
