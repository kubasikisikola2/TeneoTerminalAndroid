package com.example.teneotermandroid.models;

public class OperationModel {
    private int operationOrder;
    private String operationName;
    private float nOperations;
    private boolean finished;

    public OperationModel(int operationOrder, String operationName, float nOperations, boolean finished) {
        this.operationOrder = operationOrder;
        this.operationName = operationName;
        this.nOperations = nOperations;
        this.finished = finished;
    }

    public void setOperationOrder(int operationOrder) {
        this.operationOrder = operationOrder;
    }

    public void setOperationName(String operationName) {
        this.operationName = operationName;
    }

    public void setnOperations(float nOperations) {
        this.nOperations = nOperations;
    }

    public void setFinished(boolean finished) {
        this.finished = finished;
    }

    public int getOperationOrder() {
        return operationOrder;
    }

    public String getOperationName() {
        return operationName;
    }

    public float getnOperations() {
        return nOperations;
    }

    public boolean isFinished() {
        return finished;
    }
}
