package com.gxj.service;

import com.gxj.vo.PageBean;

import java.util.Map;

public interface PositionsInfoService {


    /**
     * 分页查询
     * @return
     */
    public PageBean findPageBean(Map map);

}
