package com.soict.hoangviet.model;

public class ProcessList extends BaseModel {
    private String name;
    private String pid;
    private String pri;
    private String thd;
    private String hnd;
    private String priv;
    private String cpuTime;
    private String elapsedTime;

    public ProcessList(String name, String pid, String pri, String thd, String hnd, String priv, String cpuTime,
                       String elapsedTime) {
        this.name = name;
        this.pid = pid;
        this.pri = pri;
        this.thd = thd;
        this.hnd = hnd;
        this.priv = priv;
        this.cpuTime = cpuTime;
        this.elapsedTime = elapsedTime;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPid() {
        return pid;
    }

    public void setPid(String pid) {
        this.pid = pid;
    }

    public String getPri() {
        return pri;
    }

    public void setPri(String pri) {
        this.pri = pri;
    }

    public String getThd() {
        return thd;
    }

    public void setThd(String thd) {
        this.thd = thd;
    }

    public String getHnd() {
        return hnd;
    }

    public void setHnd(String hnd) {
        this.hnd = hnd;
    }

    public String getPriv() {
        return priv;
    }

    public void setPriv(String priv) {
        this.priv = priv;
    }

    public String getCpuTime() {
        return cpuTime;
    }

    public void setCpuTime(String cpuTime) {
        this.cpuTime = cpuTime;
    }

    public String getElapsedTime() {
        return elapsedTime;
    }

    public void setElapsedTime(String elapsedTime) {
        this.elapsedTime = elapsedTime;
    }
}
