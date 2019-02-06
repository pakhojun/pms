package com.gxj.service;

import com.gxj.pojo.PositionsInfo;
import com.gxj.vo.PageBean;

import java.util.Map;

public interface PositionsInfoService {


    /**
     * 分页查询
     * @return
     */
    public PageBean findPageBean(Map map);


    /**
     * 添加
     * @param positionsInfo
     */
    public void insert(PositionsInfo positionsInfo);
}
