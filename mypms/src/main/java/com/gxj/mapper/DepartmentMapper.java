package com.gxj.mapper;

import com.gxj.pojo.Department;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface DepartmentMapper {

    /**
     * 查询列表
     * @return
     */
    public List<Department> findList();

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
    public List<Department> findListLimit(@Param("startIndex") Integer startIndex,@Param("pageSize") Integer pageSize,
                                          @Param("queryString") String queryString);

}
