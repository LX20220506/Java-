package UserDemo.Servlet;

import UserDemo.Dao.UserDao;

public class UserServlet {
    private UserDao userDao;

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    // 通过构造函数创建userDao对象
    public UserServlet(UserDao userDao) {
        this.userDao = userDao;
    }

    // 创建无参构造函数；在测试set注入时，使用
    public UserServlet() {
    }

    public void Add(){
        System.out.println("UserServlet  Add------");
        userDao.Add();
    }
}
