package com.babushka.nestingDoll;
import org.springframework.data.repository.CrudRepository;


    public interface FactRepository extends CrudRepository<Fact, Integer> {
        Fact findById(int id);
    }
