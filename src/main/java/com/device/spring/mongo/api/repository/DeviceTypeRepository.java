package com.device.spring.mongo.api.repository;

import com.device.spring.mongo.api.model.Device;
import com.device.spring.mongo.api.model.DeviceType;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DeviceTypeRepository extends MongoRepository<DeviceType, String> {
}
