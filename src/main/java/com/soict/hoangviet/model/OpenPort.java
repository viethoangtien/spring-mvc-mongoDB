package com.soict.hoangviet.model;

public class OpenPort extends BaseModel {
    private String proto;
    private String localAddress;
    private String foreignAddress;
    private String state;
    private String pid;

    public OpenPort(String proto, String localAddress, String foreignAddress, String state, String pid) {
        super();
        this.proto = proto;
        this.localAddress = localAddress;
        this.foreignAddress = foreignAddress;
        this.state = state;
        this.pid = pid;
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
    public String getPid() {
        return pid;
    }
    public void setPid(String pid) {
        this.pid = pid;
    }
}
