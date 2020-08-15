package com.codeh.questionbank.data;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "user_info")
public class UserInfo implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(insertable = false, name = "user_id", nullable = false)
    private Integer userId;

    @Column(name = "username", nullable = false)
    private String username;

    @Column(name = "pwd", nullable = false)
    private String pwd;

    @Column(name = "roles")
    private String roles;

    public UserInfo() {
    }

    UserInfo(String username, String pwd, String roles) {
        this.username = username;
        this.pwd = pwd;
        this.roles = roles;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    public String getRoles() {
        return roles;
    }

    public void setRoles(String roles) {
        this.roles = roles;
    }

    public String toString() {
      return "UserInfo{userId=" + userId + 
        ", username=" + username + 
        ", pwd=" + pwd + 
        ", roles=" + roles + 
        "}";
    }
}