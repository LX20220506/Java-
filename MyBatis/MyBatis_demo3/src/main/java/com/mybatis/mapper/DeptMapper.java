package com.mybatis.mapper;

import com.mybatis.entity.Dept;
import com.mybatis.entity.Emp;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface DeptMapper {

    /**
     * 根据id查询部门
     */
    Dept getDeptById(@Param("did") int did);

    /**
     * 查询某一部门的所有员工
     */
    Dept getEmpsById(@Param("did") int did);

    /**
     * 查询某一部门的所有员工
     */
    Dept getDeptAndEmpByStepOne(@Param("did") int did);

}
