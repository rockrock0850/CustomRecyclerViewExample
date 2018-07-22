package com.example.lib;

/**
 * @author adam_yeh
 * @date 7/19/18
 */
public class Addr {

    private String zip;
    private int city;
    private int county;
    private String full_addr;
    private String addr;

    public String getZip () {
        return zip;
    }

    public void setZip (String zip) {
        this.zip = zip;
    }

    public int getCity () {
        return city;
    }

    public void setCity (int city) {
        this.city = city;
    }

    public int getCounty () {
        return county;
    }

    public void setCounty (int county) {
        this.county = county;
    }

    public String getFull_addr () {
        return full_addr;
    }

    public void setFull_addr (String full_addr) {
        this.full_addr = full_addr;
    }

    public String getAddr () {
        return addr;
    }

    public void setAddr (String addr) {
        this.addr = addr;
    }

}
