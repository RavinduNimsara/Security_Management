/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author Dell
 */
public class Payment {
    private String pid;
    private String rid;
    private String date;
    private double amountUS$;
    private double amountRs;
    private double rate;

    public Payment() {
    }

    public Payment(String pid, String rid, String date, double amountUS$, double amountRs, double rate) {
        this.pid = pid;
        this.rid = rid;
        this.date = date;
        this.amountUS$ = amountUS$;
        this.amountRs = amountRs;
        this.rate = rate;
    }

    

    /**
     * @return the pid
     */
    public String getPid() {
        return pid;
    }

    /**
     * @param pid the pid to set
     */
    public void setPid(String pid) {
        this.pid = pid;
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
     * @return the amountUS$
     */
    public double getAmountUS$() {
        return amountUS$;
    }

    /**
     * @param amountUS$ the amountUS$ to set
     */
    public void setAmountUS$(double amountUS$) {
        this.amountUS$ = amountUS$;
    }

    /**
     * @return the amountRs
     */
    public double getAmountRs() {
        return amountRs;
    }

    /**
     * @param amountRs the amountRs to set
     */
    public void setAmountRs(double amountRs) {
        this.amountRs = amountRs;
    }

    /**
     * @return the rate
     */
    public double getRate() {
        return rate;
    }

    /**
     * @param rate the rate to set
     */
    public void setRate(double rate) {
        this.rate = rate;
    }

    
}
