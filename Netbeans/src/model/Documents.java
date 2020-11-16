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
public class Documents {
    private String sid;
    private boolean policeReport;
    private boolean medicalReport;
    private String nicNo;
    private String nicNoNOK;
    private boolean noObjectionLetter;
    private String passportNo;
    private String bankPassbookNo;
    private String yellowFeverCardNo;
    private String cdcNo ;
    private boolean statues;

    public Documents() {
    }

    public Documents(String sid, boolean policeReport, boolean medicalReport, String nicNo, String nicNoNOK, boolean noObjectionLetter, String passportNo, String bankPassbookNo, String yellowFeverCardNo, String cdcNo, boolean statues) {
        this.sid = sid;
        this.policeReport = policeReport;
        this.medicalReport = medicalReport;
        this.nicNo = nicNo;
        this.nicNoNOK = nicNoNOK;
        this.noObjectionLetter = noObjectionLetter;
        this.passportNo = passportNo;
        this.bankPassbookNo = bankPassbookNo;
        this.yellowFeverCardNo = yellowFeverCardNo;
        this.cdcNo = cdcNo;
        this.statues = statues;
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
     * @return the policeReport
     */
    public boolean isPoliceReport() {
        return policeReport;
    }

    /**
     * @param policeReport the policeReport to set
     */
    public void setPoliceReport(boolean policeReport) {
        this.policeReport = policeReport;
    }

    /**
     * @return the medicalReport
     */
    public boolean isMedicalReport() {
        return medicalReport;
    }

    /**
     * @param medicalReport the medicalReport to set
     */
    public void setMedicalReport(boolean medicalReport) {
        this.medicalReport = medicalReport;
    }

    /**
     * @return the nicNo
     */
    public String getNicNo() {
        return nicNo;
    }

    /**
     * @param nicNo the nicNo to set
     */
    public void setNicNo(String nicNo) {
        this.nicNo = nicNo;
    }

    /**
     * @return the nicNoNOK
     */
    public String getNicNoNOK() {
        return nicNoNOK;
    }

    /**
     * @param nicNoNOK the nicNoNOK to set
     */
    public void setNicNoNOK(String nicNoNOK) {
        this.nicNoNOK = nicNoNOK;
    }

    /**
     * @return the noObjectionLetter
     */
    public boolean isNoObjectionLetter() {
        return noObjectionLetter;
    }

    /**
     * @param noObjectionLetter the noObjectionLetter to set
     */
    public void setNoObjectionLetter(boolean noObjectionLetter) {
        this.noObjectionLetter = noObjectionLetter;
    }

    /**
     * @return the passportNo
     */
    public String getPassportNo() {
        return passportNo;
    }

    /**
     * @param passportNo the passportNo to set
     */
    public void setPassportNo(String passportNo) {
        this.passportNo = passportNo;
    }

    /**
     * @return the bankPassbookNo
     */
    public String getBankPassbookNo() {
        return bankPassbookNo;
    }

    /**
     * @param bankPassbookNo the bankPassbookNo to set
     */
    public void setBankPassbookNo(String bankPassbookNo) {
        this.bankPassbookNo = bankPassbookNo;
    }

    /**
     * @return the yellowFeverCardNo
     */
    public String getYellowFeverCardNo() {
        return yellowFeverCardNo;
    }

    /**
     * @param yellowFeverCardNo the yellowFeverCardNo to set
     */
    public void setYellowFeverCardNo(String yellowFeverCardNo) {
        this.yellowFeverCardNo = yellowFeverCardNo;
    }

    /**
     * @return the cdcNo
     */
    public String getCdcNo() {
        return cdcNo;
    }

    /**
     * @param cdcNo the cdcNo to set
     */
    public void setCdcNo(String cdcNo) {
        this.cdcNo = cdcNo;
    }

    /**
     * @return the statues
     */
    public boolean isStatues() {
        return statues;
    }

    /**
     * @param statues the statues to set
     */
    public void setStatues(boolean statues) {
        this.statues = statues;
    }
    
    
    
}
