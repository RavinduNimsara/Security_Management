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
public class Ship {
    private String shipId;
    private String shipOwnerId;
    private String shipName;
    private String cargoType;
    private String tele;
    private String email;

    public Ship() {
    }

    public Ship(String shipId, String shipOwnerId, String shipName, String cargoType, String tele, String email) {
        this.shipId = shipId;
        this.shipOwnerId = shipOwnerId;
        this.shipName = shipName;
        this.cargoType = cargoType;
        this.tele = tele;
        this.email = email;
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
     * @return the shipOwnerId
     */
    public String getShipOwnerId() {
        return shipOwnerId;
    }

    /**
     * @param shipOwnerId the shipOwnerId to set
     */
    public void setShipOwnerId(String shipOwnerId) {
        this.shipOwnerId = shipOwnerId;
    }

    /**
     * @return the shipName
     */
    public String getShipName() {
        return shipName;
    }

    /**
     * @param shipName the shipName to set
     */
    public void setShipName(String shipName) {
        this.shipName = shipName;
    }

    /**
     * @return the cargoType
     */
    public String getCargoType() {
        return cargoType;
    }

    /**
     * @param cargoType the cargoType to set
     */
    public void setCargoType(String cargoType) {
        this.cargoType = cargoType;
    }

    /**
     * @return the tele
     */
    public String getTele() {
        return tele;
    }

    /**
     * @param tele the tele to set
     */
    public void setTele(String tele) {
        this.tele = tele;
    }

    /**
     * @return the email
     */
    public String getEmail() {
        return email;
    }

    /**
     * @param email the email to set
     */
    public void setEmail(String email) {
        this.email = email;
    }
    
    
}
