package com.homework.hw3.repo;

import com.homework.hw3.entity.MyEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MyRepository extends CrudRepository<MyEntity, Long> {

    List<MyEntity> findByName(String name);

}
