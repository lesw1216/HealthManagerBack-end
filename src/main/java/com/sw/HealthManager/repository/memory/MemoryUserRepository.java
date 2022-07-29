package com.sw.HealthManager.repository.memory;

import com.sw.HealthManager.domain.Member;
import com.sw.HealthManager.repository.UserRepository;
import org.springframework.stereotype.Repository;

import java.util.HashMap;

//@Repository
public class MemoryUserRepository implements UserRepository {

    HashMap<String, Member> store = new HashMap<String, Member>();

    public MemoryUserRepository() {
        store.put("test", new Member("test", "1234", "테스터"));
    }

    @Override
    public boolean save(Member member) {
        String name = member.getMemberId();
        boolean isUser = store.containsKey(name);
        if (isUser) {
            return false;
        }

        store.put(member.getMemberId(), member);
        return true;
    }

    @Override
    public Member findByName(String name) {
        return store.get(name);
    }
}
