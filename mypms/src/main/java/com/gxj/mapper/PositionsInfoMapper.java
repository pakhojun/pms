package com.gxj.mapper;

import com.gxj.pojo.PositionsInfo;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface PositionsInfoMapper {


    /**
     * 查询总条数
     * @return
     */
    public Integer count(@Param("queryString") String queryString);

    /**
     * 分页查询
     * @param startIndex
     * @param pageSize
     * @return
     */
    public List<PositionsInfo> findListLimit(@Param("startIndex") Integer startIndex, @Param("pageSize") Integer pageSize,
                                             @Param("queryString") String queryString);


    /**
     * 添加
     * @param positionsInfo
     */
    public void insert(PositionsInfo positionsInfo);


    /**
     * 根据id查
     * @param id
     * @return
     */
    public PositionsInfo findOne(Integer id);


    /**
     * 更新操作
     * @param positionsInfo
     */
    public void update(PositionsInfo positionsInfo);


    /**
     * 删除
     * @param id
     */
    public void delete(Integer id);
}
