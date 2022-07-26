package com.ZhongZhi.service;

import com.ZhongZhi.entity.DiKuai;
import com.ZhongZhi.entity.DiKuaiExample;
import com.ZhongZhi.entity.User;
import com.ZhongZhi.mapper.DiKuaiMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class DiKuaiService {

    @Autowired
    private DiKuaiMapper dikuaiMapper;

    /**
     * 获取所有地块信息
     * @return
     */
    public List<DiKuai> getAllDiKuai(){
        List<DiKuai> diKuais = dikuaiMapper.selectByExample(null);
        return diKuais;
    }

    /**
     * 根据角色查询数据
     */
    public List<DiKuai> getDiKuaiByRole(User user){
        return dikuaiMapper.selectByRole(user);
    }

    /**
     * 添加地块信息
     */
    public int addDiKuai(DiKuai dk){
        return dikuaiMapper.insert(dk);
    }

    /**
     * 根据id查询信息
     */
    public DiKuai getDiKuaiById(int id){
        return dikuaiMapper.selectByPrimaryKey(id);
    }

    /**
     * 修改地块信息
     */
    public int updateDiKuai(DiKuai diKuai){
        return dikuaiMapper.updateByPrimaryKeySelective(diKuai);
    }

    /**
     * 根据id删除地块信息
     */
    public int deleteDikuai(int id){
        return dikuaiMapper.deleteByPrimaryKey(id);
    }

}
