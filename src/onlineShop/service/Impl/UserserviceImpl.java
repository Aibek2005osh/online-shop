package onlineShop.service.Impl;

import onlineShop.dao.UserDao;
import onlineShop.databece.Databece;
import onlineShop.models.User;
import onlineShop.service.Usersrvice;

import java.util.Scanner;

public class UserserviceImpl implements Usersrvice {
    public final UserDao userDao;

    public UserserviceImpl(UserDao userDao) {
        this.userDao = userDao;

    }

    @Override
    public String singUp(User newUser) {
        if (!newUser.getEmail().contains("@gmail.com")) {
            throw new RuntimeException("email tuura emes");
        } else {
            for (int i = 0; i < Databece.users.length; i++) {
                if (Databece.users[i].equals(newUser)) {
                    throw new RuntimeException("mydai" + newUser.getEmail() + "bar baska tyrdo jaz!!");
                }

            }
        }                //null          0 < 4
        if (newUser.getPassword().length() < 4 ||
            !newUser.getPassword().matches(".*[A-Z].*") ||    // Чоң тамга
            !newUser.getPassword().matches(".*\\d.*") ||       // Сан
            !newUser.getPassword().matches(".*[!@#$%^&*(),.?\":{}|<>].*")) { // Символ
            throw new RuntimeException("Пароль талаптарды аткарбайт. Пароль: 4 символдон көп болушу керек, бир чоң тамга, бир сан жана бир символ болушу керек.");
        }


        userDao.save(newUser);
        return " succesful user";
    }

    @Override
    public String login(User gmail, User password) {

        Scanner scanner = new Scanner(System.in);
        boolean isblok = false;
        for (int i = 0; i < Databece.users.length; i++) {
            if (Databece.users[i].equals(gmail)) {
                isblok = true;
              gmail.setEmail(scanner.nextLine());
            }
            if (!isblok) {
                System.out.println("error");
            }
            if (Databece.users[i].equals(password)) {
                isblok = true;
                password.setPassword(scanner.nextLine());
            }
        }


        userDao.loginDao(gmail, password);


        return "";
    }


}
