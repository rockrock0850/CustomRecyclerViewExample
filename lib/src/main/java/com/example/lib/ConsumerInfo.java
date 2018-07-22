package com.example.lib;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

/**
 * Created by mike_tsai on 3/4/18.
 */

public class ConsumerInfo implements Serializable {

    @SerializedName("name")
    private String name;
    @SerializedName("email")
    private String email;
    @SerializedName("addr")
    private Addr addr;
    @SerializedName("tel")
    private String tel;
    @SerializedName("mobile")
    private String mobile;

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public Addr getAddr() {
        return addr;
    }

    public String getTel() {
        return tel;
    }

    public String getMobile() {
        return mobile;
    }


    public ConsumerInfo () {

    }

}
