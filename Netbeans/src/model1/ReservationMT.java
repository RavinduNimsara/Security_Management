/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model1;

/**
 *
 * @author Dell
 */
public class ReservationMT {
    private String rid;
    private String sid;
    private String shipId;
    private String date;

    public ReservationMT() {
    }

    public ReservationMT(String rid, String sid, String shipId, String date) {
        this.rid = rid;
        this.sid = sid;
        this.shipId = shipId;
        this.date = date;
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
    
}
