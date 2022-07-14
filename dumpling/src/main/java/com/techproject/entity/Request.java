package com.techproject.entity;

public class Request {
    private int ticketNumber;
    private String requestDesc;
    private int requestMoney;
    private String status;
    private String managerReason;

    
    public Request() {
    }
    public Request(int ticketNumber, String requestDesc, int requestMoney, String status, String managerReason) {
        this.ticketNumber = ticketNumber;
        this.requestDesc = requestDesc;
        this.requestMoney = requestMoney;
        this.status = status;
        this.managerReason = managerReason;
    }
    public Request(String requestDesc, int requestMoney, String status, String managerReason) {
        this.requestDesc = requestDesc;
        this.requestMoney = requestMoney;
        this.status = status;
        this.managerReason = managerReason;
    }
    public int getTicketNumber() {
        return ticketNumber;
    }
    public void setTicketNumber(int ticketNumber) {
        this.ticketNumber = ticketNumber;
    }
    public String getRequestDesc() {
        return requestDesc;
    }
    public void setRequestDesc(String requestDesc) {
        this.requestDesc = requestDesc;
    }
    public int getRequestMoney() {
        return requestMoney;
    }
    public void setRequestMoney(int requestMoney) {
        this.requestMoney = requestMoney;
    }
    public String getStatus() {
        return status;
    }
    public void setStatus(String status) {
        this.status = status;
    }
    public String getManagerReason() {
        return managerReason;
    }
    public void setManagerReason(String managerReason) {
        this.managerReason = managerReason;
    }
    @Override
    public String toString() {
        return "Request [managerReason=" + managerReason + ", requestDesc=" + requestDesc + ", requestMoney="
                + requestMoney + ", status=" + status + ", ticketNumber=" + ticketNumber + "]";
    }
    
}
