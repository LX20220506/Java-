package com.ssm.service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.ssm.entity.Emp;
import com.ssm.entity.EmpExample;
import com.ssm.mapper.EmpMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class EmpService {

    @Autowired
    private EmpMapper empMapper;

    /**
     * 查询所有的信息
     */
    public List<Emp> getAllEmp(){
        List<Emp> emps = empMapper.selectByExample(null);

        return emps;
    }

    /**
     * 根据姓名查询信息
     */
    public List<Emp> getAllEmpByName(String name){
        EmpExample empExample = new EmpExample();
        empExample.createCriteria().andEmpNameLike(name);
        List<Emp> emps = empMapper.selectByExample(empExample);
        return emps;
    }

    /**
     * 添加员工
     */
    public int addEmp(Emp emp){
        return empMapper.insert(emp);
    }

    /**
     * 根据id查找员工
     */
    public Emp getEmpById(int id){
        return  empMapper.selectByPrimaryKey(id);
    }

    /**
     * 修改Emp
     */
    public int getUpdateEmp(Emp emp){
        return  empMapper.updateByPrimaryKey(emp);
    }

    /**
     * 根据Id
     */
    public int getDeleteById(int id){
        return empMapper.deleteByPrimaryKey(id);
    }

    /**
     * 分页查询
     */
    public PageInfo<Emp> getAllEmpByPage(int index,int size){
        PageHelper.startPage(index,size);
        List<Emp> emps = empMapper.selectByExample(null);
        PageInfo<Emp> empPageInfo = new PageInfo<>(emps, 3);
        return empPageInfo;
    }

}
