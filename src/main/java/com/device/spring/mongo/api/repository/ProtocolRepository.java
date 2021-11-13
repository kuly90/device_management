package com.device.spring.mongo.api.repository;

import com.device.spring.mongo.api.model.Protocol;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProtocolRepository extends MongoRepository<Protocol, String> {

}
