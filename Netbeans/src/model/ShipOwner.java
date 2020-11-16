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
public class ShipOwner {
    private String shipOwnerId;
    private String name;
    private String country;
    private String telephone;
    private String email;

    public ShipOwner() {
    }

    public ShipOwner(String shipOwnerId, String name, String country, String telephone, String email) {
        this.shipOwnerId = shipOwnerId;
        this.name = name;
        this.country = country;
        this.telephone = telephone;
        this.email = email;
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
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the country
     */
    public String getCountry() {
        return country;
    }

    /**
     * @param country the country to set
     */
    public void setCountry(String country) {
        this.country = country;
    }

    /**
     * @return the telephone
     */
    public String getTelephone() {
        return telephone;
    }

    /**
     * @param telephone the telephone to set
     */
    public void setTelephone(String telephone) {
        this.telephone = telephone;
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
