package com.sw.HealthManager.database;


// 데이터베이스 종류가 바뀌어도 여기만 수정
public abstract class ConnectionConst {
    public static final String URL = "jdbc:mysql://localhost:3306/HealthManager";
    public static final String USERNAME = "test";
    public static final String PASSWORD = "test";
}
