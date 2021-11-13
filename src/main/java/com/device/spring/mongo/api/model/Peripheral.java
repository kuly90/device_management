package com.device.spring.mongo.api.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

@Document(collection = "peripheral")
public class Peripheral {

    @Id
    @Field("peripheralId")
    private String peripheralId;

    @Field("peripheralName")
    private String peripheralName;

    @Field("deviceType")
    private DeviceType deviceType;

    /**
     * one Peripheral has one protocol
     */
    @Field("protocol")
    private Protocol protocol;

    public String getPeripheralId() {
        return peripheralId;
    }

    public void setPeripheralId(String peripheralId) {
        this.peripheralId = peripheralId;
    }

    public String getPeripheralName() {
        return peripheralName;
    }

    public void setPeripheralName(String peripheralName) {
        this.peripheralName = peripheralName;
    }

    public DeviceType getDeviceType() {
        return deviceType;
    }

    public void setDeviceType(DeviceType deviceType) {
        this.deviceType = deviceType;
    }

    public Protocol getProtocol() {
        return protocol;
    }

    public void setProtocol(Protocol protocol) {
        this.protocol = protocol;
    }
}
