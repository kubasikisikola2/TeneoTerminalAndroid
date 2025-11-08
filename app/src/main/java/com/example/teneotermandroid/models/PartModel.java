package com.example.teneotermandroid.models;

import java.util.ArrayList;

public class PartModel {
    private String orderNum;
    private String orderLine;
    private String partName;
    private String partCode;
    private int partVersion;
    private String partSerialNumber;
    private ArrayList<OperationModel> operations;

    public PartModel() {
        operations = new ArrayList<OperationModel>();
    }

    public void setOperations(ArrayList<OperationModel> operations) {
        this.operations = operations;
    }

    public ArrayList<OperationModel> getOperations() {
        return operations;
    }

    public void setOrderNum(String orderNum) {
        this.orderNum = orderNum;
    }

    public void setOrderLine(String orderLine) {
        this.orderLine = orderLine;
    }

    public void setPartName(String partName) {
        this.partName = partName;
    }

    public void setPartCode(String partCode) {
        this.partCode = partCode;
    }

    public void setPartVersion(int partVersion) {
        this.partVersion = partVersion;
    }

    public void setPartSerialNumber(String partSerialNumber) {
        this.partSerialNumber = partSerialNumber;
    }

    public String getOrderNum() {
        return orderNum;
    }

    public String getOrderLine() {
        return orderLine;
    }

    public String getPartName() {
        return partName;
    }

    public String getPartCode() {
        return partCode;
    }

    public int getPartVersion() {
        return partVersion;
    }

    public String getPartSerialNumber() {
        return partSerialNumber;
    }
}
