package com.ZhongZhi.mapper;

import com.ZhongZhi.entity.DiKuai;
import com.ZhongZhi.entity.DiKuaiExample;
import java.util.List;
import java.util.Map;

import com.ZhongZhi.entity.User;
import org.apache.ibatis.annotations.Param;

public interface DiKuaiMapper {
    int countByExample(DiKuaiExample example);

    int deleteByExample(DiKuaiExample example);

    int deleteByPrimaryKey(Integer dkid);

    int insert(DiKuai record);

    int insertSelective(DiKuai record);

    List<DiKuai> selectByExample(DiKuaiExample example);

    DiKuai selectByPrimaryKey(Integer dkid);

    int updateByExampleSelective(@Param("record") DiKuai record, @Param("example") DiKuaiExample example);

    int updateByExample(@Param("record") DiKuai record, @Param("example") DiKuaiExample example);

    int updateByPrimaryKeySelective(DiKuai record);

    int updateByPrimaryKey(DiKuai record);

    /**
     * 根据角色查询
     */
    List<DiKuai> selectByRole(User user);

}