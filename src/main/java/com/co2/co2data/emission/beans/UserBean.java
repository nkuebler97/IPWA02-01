package com.co2.co2data.emission.beans;
import com.co2.co2data.emission.dao.UserDAO;
import com.co2.co2data.emission.entities.User;
import jakarta.enterprise.context.SessionScoped;
import jakarta.inject.Inject;
import jakarta.inject.Named;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import java.io.Serializable;

@Named
@SessionScoped
public class UserBean implements Serializable {
    private String username;
    private String password;
    private String msg;

    @Inject
    UserDAO userDAO;

    public String login() {
        boolean found= userDAO.login(username, password);
        if (found) {
            msg="Success";
            return "addData?faces-redirect=true";
        } else {
            msg="Failed";
            return "login";
        }
    }
    public String getUsername() {
        return username;
    }
    public void setUsername(String username) {
        this.username = username;
    }
    public String getMsg() {
        return msg;
    }
    public void setMsg(String msg) {
        this.msg = msg;
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }
}
