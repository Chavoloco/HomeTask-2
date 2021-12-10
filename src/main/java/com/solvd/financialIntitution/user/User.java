package com.solvd.financialIntitution.user;

import java.util.Objects;

public class User {
    private int userId;
    private String userName;
    private  String password;

    public User() {
    }

    public User( String userName, String password) {
        this.userId = (int) Math.floor(Math.random()* 10000);
        this.userName = userName;
        this.password = password;
    }

    public int getUserId() {
        return userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return userId == user.userId && Objects.equals(userName, user.userName) && Objects.equals(password, user.password);
    }

    @Override
    public int hashCode() {
        return Objects.hash(userId, userName, password);
    }

    @Override
    public String toString() {
        return "User{" +
                "userId= " + userId +
                ", userName= '" + userName + '\'' +
                ", password= '" + password + '\'' +
                '}';
    }
}
