package onlineShop.models;

import onlineShop.enoms.Role;

import java.util.Arrays;

public class User {
    private Long id;
    private String email;
    private String password;
    private String Name;
    private Role role;
    private Product[] basket;

    private Long generteID = 0L;

    public User() {
        this.id = ++generteID;
    }

    public User( String email, String password, String name, Role role) {
        this.id = ++generteID;
        this.email = email;
        this.password = password;
        Name = name;
        this.role = role;
        this.basket = basket;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    public Product[] getBasket() {
        return basket;
    }

    public void setBasket(Product[] basket) {
        this.basket = basket;
    }

    public Long getGenerteID() {
        return generteID;
    }

    public void setGenerteID(Long generteID) {
        this.generteID = generteID;
    }

    @Override
    public String toString() {
        return "User{" +
               "id=" + id +
               ", email='" + email + '\'' +
               ", password='" + password + '\'' +
               ", Name='" + Name + '\'' +
               ", role=" + role +
               ", basket=" + Arrays.toString(basket) +
               '}';
    }

}
