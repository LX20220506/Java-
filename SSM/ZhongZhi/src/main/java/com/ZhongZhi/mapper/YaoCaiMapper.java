package com.ZhongZhi.mapper;

import com.ZhongZhi.entity.YaoCai;
import com.ZhongZhi.entity.YaoCaiExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface YaoCaiMapper {
    int countByExample(YaoCaiExample example);

    int deleteByExample(YaoCaiExample example);

    int deleteByPrimaryKey(Integer yid);

    int insert(YaoCai record);

    int insertSelective(YaoCai record);

    List<YaoCai> selectByExample(YaoCaiExample example);

    YaoCai selectByPrimaryKey(Integer yid);

    int updateByExampleSelective(@Param("record") YaoCai record, @Param("example") YaoCaiExample example);

    int updateByExample(@Param("record") YaoCai record, @Param("example") YaoCaiExample example);

    int updateByPrimaryKeySelective(YaoCai record);

    int updateByPrimaryKey(YaoCai record);
}