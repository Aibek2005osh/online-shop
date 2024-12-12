package onlineShop;

import onlineShop.dao.UserDao;
import onlineShop.dao.impl.ProductDaoImpl;
import onlineShop.dao.impl.UserDaoImpl;
import onlineShop.databece.Databece;
import onlineShop.enoms.Role;
import onlineShop.models.User;
import onlineShop.service.Impl.UserserviceImpl;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    static UserDao userDao = new UserDaoImpl();
    static ProductDaoImpl productDao = new ProductDaoImpl();
    static UserserviceImpl userservice = new UserserviceImpl(userDao);

    static User admin = new User("admin@gmail.com", "Admin123!", "Admin", Role.ADMIN);

    public static void main(String[] args) {
        while (true) {
            System.out.print("""
                    1.Registration
                    2.Login
                    0.logout
                    """);
            System.out.print("choice: ");
            int choice = 0;
            boolean b;
            do {
                try {
                    choice = new Scanner(System.in).nextInt();
                    b = false;
                } catch (InputMismatchException e) {
                    b = true;
                    System.out.print("TUURU BER : ");
                }
            } while (b);
            switch (choice) {
                case 1 -> userservice.singUp(registration());

                case 2 -> userservice.login(logininfo(),logininfo());
                case 0 -> {
                    return;
                }
                default -> System.out.println("Error choice try again!!");

            }
        }


    }

    public static User registration() {
        Scanner scanner = new Scanner(System.in);
        User user = new User();

        System.out.print("write name: ");
        user.setName(scanner.nextLine());


        System.out.print("write gmail: ");
        user.setEmail(new Scanner(System.in).nextLine());


        System.out.print("write password: ");
        user.setPassword(scanner.nextLine());

        if (!admin.getEmail().equals(user.getEmail())) {
            user.setRole(Role.CLIENT);
        }

        return user;
    }

    public static User logininfo() {
        Scanner scanner = new Scanner(System.in);
        User user = new User();

        System.out.print("Write gmail: ");
        String email = scanner.nextLine();

        System.out.print("Write password: ");
        String password = scanner.nextLine();

        boolean isBlocked = false;

        for (User user1 : Databece.users) {
            if (email.equalsIgnoreCase(user1.getEmail())) {
                if (password.equals(user1.getPassword())) {
                    System.out.println("Login successful.");
                    return user1;

                } else {
                    System.out.println("Incorrect password.");
                    return null;
                }
            }
        }

        System.out.println("User not found.");
        return null;
    }
}