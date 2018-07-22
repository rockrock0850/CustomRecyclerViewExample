package com.example.lib;

/**
 * @author adam_yeh
 * @date 7/19/18
 */
public class Address {

    private Object zip;
    private int city;
    private int county;
    private Object full_addr;
    private String addr;

    public Object getZip () {
        return zip;
    }

    public void setZip (Object zip) {
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

    public Object getFull_addr () {
        return full_addr;
    }

    public void setFull_addr (Object full_addr) {
        this.full_addr = full_addr;
    }

    public String getAddr () {
        return addr;
    }

    public void setAddr (String addr) {
        this.addr = addr;
    }

}
