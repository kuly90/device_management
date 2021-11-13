package com.device.spring.mongo.api.service.impl;

import com.device.spring.mongo.api.model.Peripheral;
import com.device.spring.mongo.api.repository.PeripheralRepository;
import com.device.spring.mongo.api.service.PeripheralService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class PeripheralServiceImpl implements PeripheralService {
    @Autowired
    PeripheralRepository periRepo;

    /**
     * Get All Peripheral
     * @return
     */
    @Override
    public List<Peripheral> getAllPeripheral() {
        // new instance List of peripheral
        List<Peripheral> lstPeripheral = new ArrayList<Peripheral>();
        // get all peripheral
        lstPeripheral = periRepo.findAll();

        return lstPeripheral;
    }

    /**
     * Insert Peripheral to database
     * @param peripheral
     */
    @Override
    public void addPeripheral(Peripheral peripheral) {
        periRepo.save(peripheral);
    }
}
