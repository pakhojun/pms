package com.gxj.service.impl;

import com.gxj.mapper.PositionsInfoMapper;
import com.gxj.pojo.PositionsInfo;
import com.gxj.service.PositionsInfoService;
import com.gxj.vo.PageBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;
@Service
public class PositionsInfoServiceImpl implements PositionsInfoService {

    @Autowired
    private PositionsInfoMapper positionsInfoMapper;

    @Override
    public PageBean findPageBean(Map map) {
        PageBean pageBean=new PageBean((Integer) map.get("currentPage"),(Integer) map.get("pageSize"));
        Integer count = positionsInfoMapper.count((String)map.get("queryString"));
        pageBean.setTotalCount(count);
        List<PositionsInfo> listLimit = positionsInfoMapper.findListLimit(pageBean.getStartIndex(), pageBean.getPageSize(),(String)map.get("queryString"));
        pageBean.setData(listLimit);
        return pageBean;
    }

    @Override
    public void insert(PositionsInfo positionsInfo) {
        positionsInfoMapper.insert(positionsInfo);
    }

    @Override
    public PositionsInfo findOne(Integer id) {
        return positionsInfoMapper.findOne(id);
    }

    @Override
    public void update(PositionsInfo positionsInfo) {
        positionsInfoMapper.update(positionsInfo);
    }

    @Override
    public void delete(Integer id) {
        positionsInfoMapper.delete(id);
    }
}
