package com.device.spring.mongo.api.service;

import com.device.spring.mongo.api.model.DeviceType;

import java.util.List;
import java.util.Optional;

public interface DeviceTypeService {
    public List<DeviceType> getAllDeviceType();

    public Optional<DeviceType> getTypeById(String typeId);
}
