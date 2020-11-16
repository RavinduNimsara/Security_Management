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
public class ReservationsOfSeaGuard {
    private String sid;
    private String rid;
    private String shipId;
    private String inDate;
    private String  outDate;

    public ReservationsOfSeaGuard() {
    }

    public ReservationsOfSeaGuard(String sid, String rid, String shipId, String inDate, String outDate) {
        this.sid = sid;
        this.rid = rid;
        this.shipId = shipId;
        this.inDate = inDate;
        this.outDate = outDate;
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
     * @return the inDate
     */
    public String getInDate() {
        return inDate;
    }

    /**
     * @param inDate the inDate to set
     */
    public void setInDate(String inDate) {
        this.inDate = inDate;
    }

    /**
     * @return the outDate
     */
    public String getOutDate() {
        return outDate;
    }

    /**
     * @param outDate the outDate to set
     */
    public void setOutDate(String outDate) {
        this.outDate = outDate;
    }

    
    
}
