package org.launchcode.MFM.models;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
public class User {

    @Id
    @GeneratedValue
    private int id;

    @NotNull
    @Size(min = 1, max =15)
    private String username;

    @Column(name = "email")
    private String email;

    @Column(name = "password")
    @NotNull
    @Size(min = 5, max = 20)
    private String password;

    @NotNull
    @Transient
    private String verifyPassword;

    public int getId() {
        return id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
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
        checkPassword();
    }

    public String getVerifyPassword() {
        return verifyPassword;
    }

    public void setVerifyPassword(String verifyPassword) {
        this.verifyPassword = verifyPassword;
        checkPassword();
    }

    private void checkPassword() {
        if(password != null && verifyPassword != null && !password.equals(verifyPassword)) {
            verifyPassword = null;
        }
    }

    public boolean isMatchingPassword(String password) {
        return Boolean.parseBoolean("redirect:/profile");

    }
}
