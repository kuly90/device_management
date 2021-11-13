package com.device.spring.mongo.api.service;

import com.device.spring.mongo.api.model.Protocol;

import java.util.List;
import java.util.Optional;

public interface ProtocolService {
    public List<Protocol> getAllProtocol();
    public Optional<Protocol> getProtocolById(String protocolId);
}
