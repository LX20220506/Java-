package com.mybatis.mapper;

import com.mybatis.entity.User;
import org.apache.ibatis.annotations.MapKey;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

public interface ParameterMapper {

    /**
     * 添加一个实体
     * @param user
     * @return
     */
    int insertUser(User user);

    /**
     * 添加一个用户，并返回id
     */
    void insertUserReturnId(User user);

    /**
     * 根据id删除
     */
    int deleteById(int id);

    /**
     * 查询，返回一个实体
     */
    User getUserById(int id);

    /**
     * 查询，返回一个集合
     */
    List<User> getAllUser();



    /**
     * 查询，返回一个map
     */
    Map<String,Object> getUserByIdReturnMep(int id);

    /**
     * 查询，返回一个map集合
     */
    @MapKey("id")
    Map<String,Object> getAllUserReturnMep();

    /**
     * 查询，返回一个map的List集合
     */
    List<Map<String,Object>> getAllUserReturnListMap();


    /**
     * 模糊查询
     */
    List<User> getLickSelect(@Param("context") String context);


    /**
     * 批量删除
     */
    int deleteMord(@Param("ids") String ids);

    /**
     * 动态设置表名
     */
    List<User> getUserByTable(@Param("tableName") String tableName);

    /**
     * 查询聚合函数
     */
    int getCount();

}
