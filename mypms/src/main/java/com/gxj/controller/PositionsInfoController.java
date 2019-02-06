package com.gxj.controller;

import com.gxj.pojo.PositionsInfo;
import com.gxj.service.PositionsInfoService;
import com.gxj.vo.PageBean;
import com.gxj.vo.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.io.UnsupportedEncodingException;
import java.util.HashMap;

@RestController
@RequestMapping("/positionsinfo")
public class PositionsInfoController {

    @Autowired
    private PositionsInfoService positionsInfoService;

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

        PageBean pageBean = positionsInfoService.findPageBean(map);
        return pageBean;
    }


    @RequestMapping("/add")
    public Result add(@RequestBody PositionsInfo positionsInfo){
        try {
            positionsInfoService.insert(positionsInfo);
            return new Result(true,"保存成功");
        } catch (Exception e) {
            e.printStackTrace();
            return new Result(false,"保存失败");
        }
    }


    @RequestMapping("/findOne")
    public PositionsInfo findOne(Integer id){
        return positionsInfoService.findOne(id);
    }


    @RequestMapping("/update")
    public Result update(@RequestBody PositionsInfo positionsInfo){
        try {
            positionsInfoService.update(positionsInfo);
            return new Result(true,"修改成功");
        } catch (Exception e) {
            e.printStackTrace();
            return new Result(false,"修改失败");
        }
    }

}
