package com.mybatis.mapper;

import com.mybatis.entity.Dept;
import org.apache.ibatis.annotations.Param;

public interface DeptMapper {

    /**
     * 根据id查询部门
     */
    Dept getDeptById(@Param("did") int did);

}
