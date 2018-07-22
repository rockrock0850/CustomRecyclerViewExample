package com.example.lib;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;


public class Invoice implements Serializable {
    private static final long serialVersionUID = 1044609500583662152L;

    private static final String FIELD_TYPE = "type";
    private static final String FIELD_RECIPIENT = "recipient";
    private static final String FIELD_ADDRESS = "address";
    private static final String FIELD_DEVICE = "device";
    private static final String FIELD_VAT = "vat";
    private static final String FIELD_COMPANY = "company";
    private static final String FIELD_DONATION = "donation";


    @SerializedName(FIELD_RECIPIENT)
    private String mRecipient;
    @SerializedName(FIELD_ADDRESS)
    private Address mAddress;
    @SerializedName(FIELD_DEVICE)
    private String mDevice;
    @SerializedName(FIELD_VAT)
    private String mVat;
    @SerializedName(FIELD_COMPANY)
    private String mCompany;

    public enum InvoiceType implements Serializable {
        /**
         * 二聯式
         */
        TWO_COPIES,
        /**
         * 三聯式
         */
        THREE_COPIES
    }

    public Invoice (){

    }


    public void setRecipient(String recipient) {
        mRecipient = recipient;
    }

    public String getRecipient() {
        return mRecipient;
    }

    public void setAddress(Address address) {
        mAddress = address;
    }

    public Address getAddress() {
        return mAddress;
    }

    public void setDevice(String device) {
        mDevice = device;
    }

    public String getDevice() {
        return mDevice;
    }

    public String getVat() {
        return mVat;
    }

    public void setVat(String mVat) {
        this.mVat = mVat;
    }

    public String getCompany() {
        return mCompany;
    }

    public void setCompany(String mCompany) {
        this.mCompany = mCompany;
    }

}
