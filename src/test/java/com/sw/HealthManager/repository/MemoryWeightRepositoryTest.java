package com.sw.HealthManager.repository;

import com.sw.HealthManager.repository.memory.MemoryWeightRepository;
import org.junit.jupiter.api.Test;
import org.springframework.stereotype.Component;

import java.util.Date;

class MemoryWeightRepositoryTest {

    final WeightRepository repository = new MemoryWeightRepository();


    @Test
    void weightSave() {
        repository.save("이상우", new Date(), 93);
    }

}