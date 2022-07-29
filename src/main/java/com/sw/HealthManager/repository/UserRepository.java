package com.sw.HealthManager.repository;

import com.sw.HealthManager.domain.Member;

public interface UserRepository {

    // 저장
    boolean save(Member member);

    // 찾기
    Member findByName(String name);
}
