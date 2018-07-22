package com.example.lib;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

/**
 * 超商資料
 */
public class CvsStore implements Serializable {

    private static final long serialVersionUID = 5480128756984312381L;

    private long _ID;    // index value for local db

    public enum GroupType {
        @SerializedName("711")
        SEVEN_ELEVEN,
        @SerializedName("FAMILY")
        FAMILY,
        @SerializedName("HILIFE")
        HILIFE,
        @SerializedName("OKMART")
        OKMART
    }

    @SerializedName("srv_no")
    private String srvNo;
    @SerializedName("group")
    private GroupType group;
    @SerializedName("name")
    private String name;
    @SerializedName("zipcode")
    private String zipCode;
    @SerializedName("city")
    private String city;
    @SerializedName("region")
    private String region;
    @SerializedName("address")
    private String address;
    @SerializedName("telephone")
    private String telephone;

    private String road;

    private boolean titleOrNot = false;

    public long get_ID() {
        return _ID;
    }

    public void set_ID(long _ID) {
        this._ID = _ID;
    }

    public String getRoad() {
        return road;
    }

    public void setRoad(String road) {
        this.road = road;
    }

    public String getSrvNo() {
        return srvNo;
    }

    public void setSrvNo(String srvNo) {
        this.srvNo = srvNo;
    }

    public GroupType getGroup() {
        return group;
    }

    public void setGroup(GroupType group) {
        this.group = group;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

//    public String getZipcode() {
//        return zipcode;
//    }
//
//    public void setZipcode(String zipcode) {
//        this.zipcode = zipcode;
//    }

    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public boolean isTitleOrNot() {
        return titleOrNot;
    }

    public void setTitleOrNot(boolean titleOrNot) {
        this.titleOrNot = titleOrNot;
    }
}
