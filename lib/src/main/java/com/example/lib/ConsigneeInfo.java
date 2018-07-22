package com.example.lib;

import com.google.gson.annotations.SerializedName;

/**
 * Created by mike_tsai on 3/4/18.
 */

public class ConsigneeInfo extends ConsumerInfo {

    @SerializedName("id")
    private int id;
    @SerializedName("memo")
    private String memo;

    public int getId() {
        return id;
    }

    public String getMemo() {
        return memo;
    }

}
