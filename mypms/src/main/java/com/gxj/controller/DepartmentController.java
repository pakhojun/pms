package com.gxj.controller;

import com.gxj.pojo.Department;
import com.gxj.service.DepartmentService;
import com.gxj.vo.PageBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.io.UnsupportedEncodingException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/department")
public class DepartmentController {

    @Autowired
    private DepartmentService departmentService;


    @RequestMapping("/findList")
    public List<Department> findList(){
        return  departmentService.findList();
    }

    @RequestMapping("/findPageBean")
    public PageBean findPageBean(@RequestParam(defaultValue = "1") Integer currentPage,
                                 @RequestParam(defaultValue = "5") Integer pageSize,
                                 String queryString) throws UnsupportedEncodingException {
        if(queryString!=null){
            //queryString=new String(queryString.getBytes("iso-8859-1");
            queryString=new String(queryString.getBytes("iso-8859-1"),"UTF-8");
        }


        HashMap map=new HashMap();

        map.put("currentPage",currentPage);
        map.put("pageSize",pageSize);
        map.put("queryString",queryString);

        PageBean pageBean = departmentService.findPageBean(map);
        return pageBean;
    }

}
