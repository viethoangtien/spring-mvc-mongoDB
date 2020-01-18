package com.soict.hoangviet.model;

public class EstablishConnection extends BaseModel {
    private String proto;
    private String localAddress;
    private String foreignAddress;
    private String state;
    private String pid;

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
    public String getPid() {
        return pid;
    }
    public void setPid(String pid) {
        this.pid = pid;
    }

}
