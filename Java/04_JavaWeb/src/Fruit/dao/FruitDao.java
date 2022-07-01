package Fruit.dao;

import  Fruit.dao.impl.FruitDaoImpl;
import  Fruit.pojo.Fruit;

import java.util.List;

public class FruitDao extends BaseDao<Fruit> implements FruitDaoImpl {
    @Override
    public List<Fruit> getFruitList() {
        List<Fruit> datalist = getBeanList(Fruit.class,"SELECT fid FId,fname FName,price Price ,fcount FCount,remark Remark FROM `t_fruit`");
        return datalist;
    }
}
