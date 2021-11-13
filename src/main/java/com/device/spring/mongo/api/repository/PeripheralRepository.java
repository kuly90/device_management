package com.device.spring.mongo.api.repository;

import com.device.spring.mongo.api.model.Peripheral;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PeripheralRepository extends MongoRepository<Peripheral, String> {

}
