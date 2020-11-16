/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.Date;

/**
 *
 * @author Dell
 */
public class Reservation {
    private String rid;
    private String sid;
    private String shipId;
    private String date;
    private String signInDate;
    private String signOutDate;
    private String signInPort;
    private String signOutPort;
    private double agreedSalary;

    public Reservation() {
    }

    public Reservation(String rid, String sid, String shipId, String date, String signInDate, String signOutDate, String signInPort, String signOutPort, double agreedSalary) {
        this.rid = rid;
        this.sid = sid;
        this.shipId = shipId;
        this.date = date;
        this.signInDate = signInDate;
        this.signOutDate = signOutDate;
        this.signInPort = signInPort;
        this.signOutPort = signOutPort;
        this.agreedSalary = agreedSalary;
    }

    /**
     * @return the rid
     */
    public String getRid() {
        return rid;
    }

    /**
     * @param rid the rid to set
     */
    public void setRid(String rid) {
        this.rid = rid;
    }

    /**
     * @return the sid
     */
    public String getSid() {
        return sid;
    }

    /**
     * @param sid the sid to set
     */
    public void setSid(String sid) {
        this.sid = sid;
    }

    /**
     * @return the shipId
     */
    public String getShipId() {
        return shipId;
    }

    /**
     * @param shipId the shipId to set
     */
    public void setShipId(String shipId) {
        this.shipId = shipId;
    }

    /**
     * @return the date
     */
    public String getDate() {
        return date;
    }

    /**
     * @param date the date to set
     */
    public void setDate(String date) {
        this.date = date;
    }

    /**
     * @return the signInDate
     */
    public String getSignInDate() {
        return signInDate;
    }

    /**
     * @param signInDate the signInDate to set
     */
    public void setSignInDate(String signInDate) {
        this.signInDate = signInDate;
    }

    /**
     * @return the signOutDate
     */
    public String getSignOutDate() {
        return signOutDate;
    }

    /**
     * @param signOutDate the signOutDate to set
     */
    public void setSignOutDate(String signOutDate) {
        this.signOutDate = signOutDate;
    }

    /**
     * @return the signInPort
     */
    public String getSignInPort() {
        return signInPort;
    }

    /**
     * @param signInPort the signInPort to set
     */
    public void setSignInPort(String signInPort) {
        this.signInPort = signInPort;
    }

    /**
     * @return the signOutPort
     */
    public String getSignOutPort() {
        return signOutPort;
    }

    /**
     * @param signOutPort the signOutPort to set
     */
    public void setSignOutPort(String signOutPort) {
        this.signOutPort = signOutPort;
    }

    /**
     * @return the agreedSalary
     */
    public double getAgreedSalary() {
        return agreedSalary;
    }

    /**
     * @param agreedSalary the agreedSalary to set
     */
    public void setAgreedSalary(double agreedSalary) {
        this.agreedSalary = agreedSalary;
    }

    
    

}
