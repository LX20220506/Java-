package com.ZhongZhi.mapper;

import com.ZhongZhi.entity.JiaGong;
import com.ZhongZhi.entity.JiaGongExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface JiaGongMapper {
    int countByExample(JiaGongExample example);

    int deleteByExample(JiaGongExample example);

    int deleteByPrimaryKey(Integer jgId);

    int insert(JiaGong record);

    int insertSelective(JiaGong record);

    List<JiaGong> selectByExample(JiaGongExample example);

    JiaGong selectByPrimaryKey(Integer jgId);

    int updateByExampleSelective(@Param("record") JiaGong record, @Param("example") JiaGongExample example);

    int updateByExample(@Param("record") JiaGong record, @Param("example") JiaGongExample example);

    int updateByPrimaryKeySelective(JiaGong record);

    int updateByPrimaryKey(JiaGong record);
}