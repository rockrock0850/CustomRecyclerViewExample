package com.example.lib;

/**
 * @author adam_yeh
 * @date 7/19/18
 */
public class EasyPayInfoVO {

    private EasyPayInfo easyPayInfo;
    private Type type;

    public EasyPayInfo getEasyPayInfo () {
        return easyPayInfo;
    }

    public void setEasyPayInfo (EasyPayInfo easyPayInfo) {
        this.easyPayInfo = easyPayInfo;
    }

    public Type getType () {
        return type;
    }

    public void setType (Type type) {
        this.type = type;
    }

}
