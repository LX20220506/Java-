package com.ZhongZhi.mapper;

import com.ZhongZhi.entity.JiaGeJianKong;
import com.ZhongZhi.entity.JiaGeJianKongExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface JiaGeJianKongMapper {
    int countByExample(JiaGeJianKongExample example);

    int deleteByExample(JiaGeJianKongExample example);

    int deleteByPrimaryKey(Integer ycjdId);

    int insert(JiaGeJianKong record);

    int insertSelective(JiaGeJianKong record);

    List<JiaGeJianKong> selectByExample(JiaGeJianKongExample example);

    JiaGeJianKong selectByPrimaryKey(Integer ycjdId);

    int updateByExampleSelective(@Param("record") JiaGeJianKong record, @Param("example") JiaGeJianKongExample example);

    int updateByExample(@Param("record") JiaGeJianKong record, @Param("example") JiaGeJianKongExample example);

    int updateByPrimaryKeySelective(JiaGeJianKong record);

    int updateByPrimaryKey(JiaGeJianKong record);
}