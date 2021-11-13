package com.device.spring.mongo.api.service.impl;

import com.device.spring.mongo.api.model.Device;
import com.device.spring.mongo.api.model.DeviceType;
import com.device.spring.mongo.api.repository.DeviceTypeRepository;
import com.device.spring.mongo.api.service.DeviceTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class DeviceTypeServiceImpl implements DeviceTypeService {
    @Autowired
    DeviceTypeRepository deviceTypeRepo;

    @Override
    public List<DeviceType> getAllDeviceType() {
        // new instance List of device type
        List<DeviceType> lstDeviceType = new ArrayList<DeviceType>();
        // get all device type
        lstDeviceType = deviceTypeRepo.findAll();

        return lstDeviceType;
    }

    @Override
    public Optional<DeviceType> getTypeById(String typeId) {

        // get device type by type id
        Optional<DeviceType> type = deviceTypeRepo.findById(typeId);

        return type;
    }
}
