package com.device.spring.mongo.api.service;

import com.device.spring.mongo.api.model.Peripheral;

import java.util.List;

public interface PeripheralService {
    public List<Peripheral> getAllPeripheral();
    public void addPeripheral(Peripheral peripheral);
}
