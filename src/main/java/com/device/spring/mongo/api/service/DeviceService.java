package com.device.spring.mongo.api.service;

import com.device.spring.mongo.api.model.Device;

import java.util.List;

public interface DeviceService {
    public List<Device> getAllDevice();
    public void addDevice(Device device);
}
