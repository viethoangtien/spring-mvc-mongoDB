package com.soict.hoangviet.model;

public class NetworkStatus extends BaseModel {
    private String ipv4Address;
    private String ipv6Address;
    private String subnetMark;
    private String defaultGateway;

    public String getIpv4Address() {
        return ipv4Address;
    }
    public void setIpv4Address(String ipv4Address) {
        this.ipv4Address = ipv4Address;
    }
    public String getSubnetMark() {
        return subnetMark;
    }
    public void setSubnetMark(String subnetMark) {
        this.subnetMark = subnetMark;
    }
    public String getDefaultGateway() {
        return defaultGateway;
    }
    public void setDefaultGateway(String defaultGateway) {
        this.defaultGateway = defaultGateway;
    }
    public String getIpv6Address() {
        return ipv6Address;
    }
    public void setIpv6Address(String ipv6Address) {
        this.ipv6Address = ipv6Address;
    }
}
