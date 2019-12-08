package com.soict.hoangviet.model;

import org.bson.types.ObjectId;

public class NetworkConnectionModel {
    private String _id;
    private String proto;
    private String localAddress;
    private String foreignAddress;
    private String state;

    public String getObjectId() {
        return _id;
    }

    public void setObjectId(String _id) {
        this._id = _id;
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
