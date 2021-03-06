package com.sw.HealthManager.dto;

public class JoinDTO {
    String id;
    String password;
    String name;

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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public JoinDTO(String id, String password, String name) {
        this.id = id;
        this.password = password;
        this.name = name;
    }
}
