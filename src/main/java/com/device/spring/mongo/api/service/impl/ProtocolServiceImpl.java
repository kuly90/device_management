package com.device.spring.mongo.api.service.impl;

import com.device.spring.mongo.api.model.Protocol;
import com.device.spring.mongo.api.repository.ProtocolRepository;
import com.device.spring.mongo.api.service.ProtocolService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class ProtocolServiceImpl implements ProtocolService {

    @Autowired
    ProtocolRepository protoRepo;

    /**
     * Get all protocol
     * @return lstProtocol List
     */
    @Override
    public List<Protocol> getAllProtocol() {
        // new instance List Protocol
        List<Protocol> lstProtocol = new ArrayList<Protocol>();
        // get All protocol
        lstProtocol = protoRepo.findAll();

        return lstProtocol;
    }

    @Override
    public Optional<Protocol> getProtocolById(String protocolId) {
        Optional<Protocol> protocol = protoRepo.findById(protocolId);

        return protocol;
    }
}
