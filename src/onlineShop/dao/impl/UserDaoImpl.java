package onlineShop.dao.impl;

import onlineShop.dao.UserDao;
import onlineShop.databece.Databece;
import onlineShop.models.User;

import java.util.Arrays;

public class UserDaoImpl implements UserDao {
    @Override
    public void save(User user) {

      Databece.users=  Arrays.copyOf(Databece.users,Databece.users.length+1);
        Databece.users[Databece.users.length-1] =user;
    }

    @Override
    public void loginDao(User gmail, User password) {

    }

}
