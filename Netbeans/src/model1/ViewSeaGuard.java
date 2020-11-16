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
public class ViewSeaGuard {
    private String sid;
    private String name;
    private String address;
    private boolean statues;

    public ViewSeaGuard() {
    }

    public ViewSeaGuard(String sid, String name, String address, boolean statues) {
        this.sid = sid;
        this.name = name;
        this.address = address;
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
     * @return the address
     */
    public String getAddress() {
        return address;
    }

    /**
     * @param address the address to set
     */
    public void setAddress(String address) {
        this.address = address;
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
