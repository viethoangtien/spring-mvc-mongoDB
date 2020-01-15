package com.soict.hoangviet.model;

public class BrowserHistory {
    private String recordName;
    private String recordType;
    private String timeToLive;
    private String dataLength;
    private String section;
    private String hostRecord;
    private String date;
    private String computer;

    public String getDate() {
        return date;
    }
    public void setDate(String date) {
        this.date = date;
    }
    public String getComputer() {
        return computer;
    }
    public void setComputer(String computer) {
        this.computer = computer;
    }
    public String getRecordName() {
        return recordName;
    }
    public void setRecordName(String recordName) {
        this.recordName = recordName;
    }
    public String getRecordType() {
        return recordType;
    }
    public void setRecordType(String recordType) {
        this.recordType = recordType;
    }
    public String getTimeToLive() {
        return timeToLive;
    }
    public void setTimeToLive(String timeToLive) {
        this.timeToLive = timeToLive;
    }
    public String getDataLength() {
        return dataLength;
    }
    public void setDataLength(String dataLength) {
        this.dataLength = dataLength;
    }
    public String getSection() {
        return section;
    }
    public void setSection(String section) {
        this.section = section;
    }
    public String getHostRecord() {
        return hostRecord;
    }
    public void setHostRecord(String hostRecord) {
        this.hostRecord = hostRecord;
    }
}
