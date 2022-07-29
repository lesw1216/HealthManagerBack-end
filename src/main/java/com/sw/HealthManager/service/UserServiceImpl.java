package com.sw.HealthManager.service;

import com.sw.HealthManager.domain.Member;
import com.sw.HealthManager.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;

    @Autowired
    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }


    @Override
    public boolean save(Member member) {
        return userRepository.save(member);
    }

    @Override
    public Member findUser(String name) {
        return userRepository.findByName(name);
    }
}
