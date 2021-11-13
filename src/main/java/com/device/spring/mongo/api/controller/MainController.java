package com.device.spring.mongo.api.controller;

import com.device.spring.mongo.api.model.Device;
import com.device.spring.mongo.api.model.DeviceType;
import com.device.spring.mongo.api.model.Peripheral;
import com.device.spring.mongo.api.model.Protocol;
import com.device.spring.mongo.api.service.DeviceService;
import com.device.spring.mongo.api.service.DeviceTypeService;
import com.device.spring.mongo.api.service.PeripheralService;
import com.device.spring.mongo.api.service.ProtocolService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
public class MainController {

    @Autowired
    DeviceService deviceService;

    @Autowired
    DeviceTypeService typeService;

    @Autowired
    PeripheralService periService;

    @Autowired
    ProtocolService protoService;

    /**
     * Get All Device
     * @return lstDevice List
     */
    @GetMapping(value = "/getDevice")
    public List<Device> getAllDevice() {
        List<Device> lstDevice = deviceService.getAllDevice();

        return lstDevice;
    }

    /**
     * Get All Device type
     * @return lstDeviceType List
     */
    @GetMapping(value = "/getDeviceType")
    public List<DeviceType> getAllDeviceType() {
        List<DeviceType> lstDeviceType = typeService.getAllDeviceType();

        return  lstDeviceType;
    }

    /**
     * insert device in to database
     * @param device
     * @return Status success
     */
    @PostMapping(value = "/addDevice")
    public String addDevice(@RequestBody Device device) {
        // file device type by device type id
        Optional<DeviceType> deviceType = typeService.getTypeById(device.getDeviceType().getDeviceTypeId());
        // set device
        device.setDeviceType(deviceType.get());
        // insert device to database
        deviceService.addDevice(device);

        return "Success !!!";
    }

    /**
     * Get all Peripheral
     * @return lstPeripheral List
     */
    @GetMapping(value = "/getPeripheral")
    public List<Peripheral> getAllPeripheral() {
        List<Peripheral> lstPeripheral = periService.getAllPeripheral();

        return lstPeripheral;
    }

    /**
     * Get All Protocol
     * @return lstProtocol List
     */
    @GetMapping(value = "/getProtocol")
    public List<Protocol> getAllProtocol() {
        List<Protocol> lstProtocol = protoService.getAllProtocol();

        return lstProtocol;
    }

    /**
     * Insert peripheral into database
     * @param peripheral
     * @return Status success
     */
    @PostMapping(value = "addPeripheral")
    public String addPeripheral (@RequestBody Peripheral peripheral) {
        // file device type by device type id
        Optional<DeviceType> deviceType = typeService.getTypeById("2");
        // set device type
        peripheral.setDeviceType(deviceType.get());

        // get protocol by id
        Optional<Protocol> protocol = protoService.getProtocolById(peripheral.getProtocol().getProtocolId());
        // set Protocol
        peripheral.setProtocol(protocol.get());

        // insert Peripheral to database
        periService.addPeripheral(peripheral);

        return "Success !!!";
    }
}
