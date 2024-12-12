package onlineShop.service;

import onlineShop.models.User;

public interface Usersrvice {

    String singUp(User user);

    String login (User gmail , User password);
}
