package com.device.spring.mongo.api.service.impl;

import com.device.spring.mongo.api.model.Device;
import com.device.spring.mongo.api.repository.DeviceRepository;
import com.device.spring.mongo.api.service.DeviceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class DeviceServiceImpl implements DeviceService {

    @Autowired
    DeviceRepository deviceRepo;

    /**
     * Get all device
     * @return lstDevice
     */
    @Override
    public List<Device> getAllDevice() {
        // new instance List of device
        List<Device> lstDevice = new ArrayList<Device>();
        // get all device
        lstDevice = deviceRepo.findAll();

        return lstDevice;
    }

    /**
     * Add Device
     * @param device
     */
    @Override
    public void addDevice(Device device) {
        deviceRepo.save(device);
    }
}
