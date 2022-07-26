package com.ZhongZhi.mapper;

import com.ZhongZhi.entity.ZhongZhi;
import com.ZhongZhi.entity.ZhongZhiExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ZhongZhiMapper {
    int countByExample(ZhongZhiExample example);

    int deleteByExample(ZhongZhiExample example);

    int deleteByPrimaryKey(Integer zid);

    int insert(ZhongZhi record);

    int insertSelective(ZhongZhi record);

    List<ZhongZhi> selectByExample(ZhongZhiExample example);

    ZhongZhi selectByPrimaryKey(Integer zid);

    int updateByExampleSelective(@Param("record") ZhongZhi record, @Param("example") ZhongZhiExample example);

    int updateByExample(@Param("record") ZhongZhi record, @Param("example") ZhongZhiExample example);

    int updateByPrimaryKeySelective(ZhongZhi record);

    int updateByPrimaryKey(ZhongZhi record);
}