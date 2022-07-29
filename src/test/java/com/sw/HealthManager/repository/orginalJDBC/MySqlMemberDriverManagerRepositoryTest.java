package com.sw.HealthManager.repository.orginalJDBC;

import com.sw.HealthManager.domain.Member;
import com.sw.HealthManager.repository.UserRepository;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MySqlMemberDriverManagerRepositoryTest {

    UserRepository repository = new MySqlMemberDriverManagerRepository();

    @Test
    void crud() {
        // save
        boolean save = repository.save(new Member("kim.or0", "skdud", "김나영"));
        Assertions.assertThat(save).isTrue();
    }
}