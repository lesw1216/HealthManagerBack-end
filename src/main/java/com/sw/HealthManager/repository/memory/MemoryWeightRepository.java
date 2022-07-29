package com.sw.HealthManager.repository.memory;

import com.sw.HealthManager.repository.WeightRepository;
import org.springframework.stereotype.Repository;

import java.util.Date;
import java.util.HashMap;

@Repository
public class MemoryWeightRepository implements WeightRepository {

    private final HashMap<Date, Integer> weightStore = new HashMap<>();
    private final HashMap<String, HashMap<Date, Integer>> store
            = new HashMap<>();


    @Override
    public boolean save(String name, Date date, int weight) {

        // 처음 등록한 경우
        if (!store.containsKey(name)) {
            HashMap<Date, Integer> weightStore = new HashMap<>();
            weightStore.put(date, weight);
            store.put(name, weightStore);
            return true;
        }

        // 처음이 아닌 경우
        weightStore.put(date, weight);
        store.put(name, weightStore);
        return true;
    }

    @Override
    public int findByNameToWeight(String name) {
        return 0;
    }
}
