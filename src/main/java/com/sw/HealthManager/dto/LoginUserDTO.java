package com.sw.HealthManager.dto;

public class LoginUserDTO {
    private String id;
    private String password;

    public LoginUserDTO(String id, String password) {
        this.id = id;
        this.password = password;
    }

    public LoginUserDTO() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
