package com.example.lib;

import com.google.gson.annotations.SerializedName;

/**
 * Created by mike_tsai on 3/4/18.
 */

public class CreditCardInfo {
    private String number; //持卡人卡號
    private String name; //持卡人姓名
    private String expiration; //持卡人到期日 (格式: yyyyMM)

    public String getNumber () {
        return number;
    }

    public void setNumber (String number) {
        this.number = number;
    }

    public String getName () {
        return name;
    }

    public void setName (String name) {
        this.name = name;
    }

    public String getExpiration () {
        return expiration;
    }

    public void setExpiration (String expiration) {
        this.expiration = expiration;
    }
}
