package Thymeleaf.Fruit.dao;

import Thymeleaf.Fruit.dao.impl.FruitDaoImpl;
import Thymeleaf.Fruit.pojo.Fruit;

import java.util.List;

public class FruitDao extends BaseDao<Fruit> implements FruitDaoImpl {
    @Override
    public List<Fruit> getFruitList() {
        List<Fruit> datalist = getBeanList(Fruit.class,"SELECT fid,fname,price,fcount,remark FROM `t_fruit`");
        return datalist;
    }
}
