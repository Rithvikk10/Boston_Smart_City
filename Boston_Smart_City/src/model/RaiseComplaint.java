/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.sql.Timestamp;

/**
 *
 * @author anweshpeddineni
 */
public class RaiseComplaint {
    
    private String enterprise;
    
    private String organization;
    
    private String complaint;
    
    private String status;
    
    private Integer complaintNumber;
    
    private String residentId;
    
    private Timestamp txTimestamp;
    
    private String workerComment;

    public String getWorkerComment() {
        return workerComment;
    }

    public void setWorkerComment(String workerComment) {
        this.workerComment = workerComment;
    }

    public RaiseComplaint(String enterprise, String organization, String complaint, Integer complaintNumber, String residentId, Timestamp txTimestamp) {
        this.enterprise = enterprise;
        this.organization = organization;
        this.complaint = complaint;
//        this.complaintNumber = complaintNumber;
        this.residentId = residentId;
        this.txTimestamp = txTimestamp;
    }

    public String getResidentId() {
        return residentId;
    }

    public void setResidentId(String residentId) {
        this.residentId = residentId;
    }

    public Timestamp getTxTimestamp() {
        return txTimestamp;
    }

    public void setTxTimestamp(Timestamp txTimestamp) {
        this.txTimestamp = txTimestamp;
    }

    
    public RaiseComplaint() {
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    
    public String getEnterprise() {
        return enterprise;
    }

    public void setEnterprise(String enterprise) {
        this.enterprise = enterprise;
    }

    public String getOrganization() {
        return organization;
    }

    public void setOrganization(String organization) {
        this.organization = organization;
    }

    public String getComplaint() {
        return complaint;
    }

    public void setComplaint(String complaint) {
        this.complaint = complaint;
    }

    public Integer getComplaintNumber() {
        return complaintNumber;
    }

    public void setComplaintNumber(Integer complaintNumber) {
        this.complaintNumber = complaintNumber;
    }
    
    
}
