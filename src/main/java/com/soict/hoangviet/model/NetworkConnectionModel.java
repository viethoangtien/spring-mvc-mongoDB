package com.soict.hoangviet.model;

import org.bson.types.ObjectId;

public class NetworkConnectionModel {
    private String proto;
    private String localAddress;
    private String foreignAddress;
    private String state;
    private String date;
    private String Computer;

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getComputer() {
        return Computer;
    }

    public void setComputer(String computer) {
        Computer = computer;
    }

    public String getProto() {
        return proto;
    }

    public void setProto(String proto) {
        this.proto = proto;
    }

    public String getLocalAddress() {
        return localAddress;
    }

    public void setLocalAddress(String localAddress) {
        this.localAddress = localAddress;
    }

    public String getForeignAddress() {
        return foreignAddress;
    }

    public void setForeignAddress(String foreignAddress) {
        this.foreignAddress = foreignAddress;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

}
