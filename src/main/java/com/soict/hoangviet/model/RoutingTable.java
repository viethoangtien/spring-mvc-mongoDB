package com.soict.hoangviet.model;

public class RoutingTable extends BaseModel {
    private String networkDestination;
    private String netmask;
    private String gateway;
    private String interfacee;
    private String metric;

    public RoutingTable(String networkDestination, String netmask, String gateway, String interfacee, String metric) {
        super();
        this.networkDestination = networkDestination;
        this.netmask = netmask;
        this.gateway = gateway;
        this.interfacee = interfacee;
        this.metric = metric;
    }

    public String getNetworkDestination() {
        return networkDestination;
    }
    public void setNetworkDestination(String networkDestination) {
        this.networkDestination = networkDestination;
    }
    public String getNetmask() {
        return netmask;
    }
    public void setNetmask(String netmask) {
        this.netmask = netmask;
    }
    public String getGateway() {
        return gateway;
    }
    public void setGateway(String gateway) {
        this.gateway = gateway;
    }
    public String getInterfacee() {
        return interfacee;
    }
    public void setInterfacee(String interfacee) {
        this.interfacee = interfacee;
    }
    public String getMetric() {
        return metric;
    }
    public void setMetric(String metric) {
        this.metric = metric;
    }
}
