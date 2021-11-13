package com.device.spring.mongo.api.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import java.util.List;

@Document(collection = "device_type")
public class DeviceType {
    @Id
    @Field("deviceTypeId")
    private String deviceTypeId;

    @Field("deviceTypeName")
    private String deviceTypeName;

    /**
     * One device type has multiple peripheral
     */
    @Field("peripherals")
    private List<Peripheral> listPeripheral;

    public String getDeviceTypeId() {
        return deviceTypeId;
    }

    public void setDeviceTypeId(String deviceTypeId) {
        this.deviceTypeId = deviceTypeId;
    }

    public String getDeviceTypeName() {
        return deviceTypeName;
    }

    public void setDeviceTypeName(String deviceTypeName) {
        this.deviceTypeName = deviceTypeName;
    }

    public List<Peripheral> getListPeripheral() {
        return listPeripheral;
    }

    public void setListPeripheral(List<Peripheral> listPeripheral) {
        this.listPeripheral = listPeripheral;
    }
}
