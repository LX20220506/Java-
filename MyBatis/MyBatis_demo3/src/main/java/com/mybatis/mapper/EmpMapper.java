package com.mybatis.mapper;

import com.mybatis.entity.Emp;
import org.apache.ibatis.annotations.Param;

public interface EmpMapper {

    /**
     * 根据id查询员工
     */
    Emp getEmpById(@Param("eid") int eid);


    /**
     * 查询员工的信息和部门
     */
    Emp getEmpAndDeptById(@Param("eid") int eid);

}
