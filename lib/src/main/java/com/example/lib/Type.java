package com.example.lib;

import java.io.Serializable;


public enum Type implements Serializable {

    E_COPIES(2, "eInvoice", "二聯式發票", "二聯式電子發票"),
    E_COPIES_2(2, "eInvoice", "二聯式發票", "二聯式電子發票");

    private int number;
    private String name;
    private String shortName;
    private String longName;

    Type (int number, String name, String shortName, String longName) {
        this.number = number;
        this.name = name;
        this.shortName = shortName;
        this.longName = longName;
    }

    public int getNumber () {
        return number;
    }

    public String getName () {
        return name;
    }

    public String getShortName () {
        return shortName;
    }

    public String getLongName () {
        return longName;
    }

}