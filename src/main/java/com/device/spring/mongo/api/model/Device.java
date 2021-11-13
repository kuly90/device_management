package com.device.spring.mongo.api.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

@Document(collection = "device")
public class Device {

    @Id
    @Field("deviceId")
    private String deviceId;

    @Field("deviceName")
    private String deviceName;

    /**
     * C: connect
     * D: disconnect
     * U: Unknown
     */
    @Field("status")
    private String status;

    /**
     * one Device has one type
     * 1: Standalone
     * 2: Gateway
     */
    @Field("deviceType")
    private DeviceType deviceType;

    @Field("updDate")
    private String updDate;

    public String getDeviceId() {
        return deviceId;
    }

    public void setDeviceId(String deviceId) {
        this.deviceId = deviceId;
    }

    public String getDeviceName() {
        return deviceName;
    }

    public void setDeviceName(String deviceName) {
        this.deviceName = deviceName;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public DeviceType getDeviceType() {
        return deviceType;
    }

    public void setDeviceType(DeviceType deviceType) {
        this.deviceType = deviceType;
    }

    public String getUpdDate() {
        return updDate;
    }

    public void setUpdDate(String updDate) {
        this.updDate = updDate;
    }
}
