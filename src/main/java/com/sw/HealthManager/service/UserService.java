package com.sw.HealthManager.service;

import com.sw.HealthManager.domain.Member;

public interface UserService {

    boolean save(Member member);

    Member findUser(String name);
}
