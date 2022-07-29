package com.sw.HealthManager.repository;

import java.util.Date;

public interface WeightRepository {

    boolean save(String name, Date date, int weight);

    int findByNameToWeight(String name);
}
