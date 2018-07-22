package com.example.lib;

import com.google.gson.Gson;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.annotations.SerializedName;

import java.io.Serializable;
import java.lang.reflect.Type;

/**
 * Created by mike_tsai on 3/4/18.
 */

public class EasyPayInfo implements Serializable, JsonDeserializer<EasyPayInfo> {
    private static final String KEY_ROOT = "easyPayInfo";

    @SerializedName("creditCardInfo")
    private CreditCardInfo creditCardInfo;
    @SerializedName("consumerInfo")
    private ConsumerInfo consumerInfo;
    @SerializedName("consigneeInfo")
    private ConsigneeInfo consigneeInfo;
    @SerializedName("invoiceInfo")
    private Invoice invoiceInfo;

    private CvsStore cvsStore;

    public EasyPayInfo() {

    }

    public EasyPayInfo(CreditCardInfo creditCardInfo, ConsumerInfo consumerInfo, ConsigneeInfo consigneeInfo, Invoice invoiceInfo, CvsStore store) {
        this.creditCardInfo = creditCardInfo;
        this.consumerInfo = consumerInfo;
        this.consigneeInfo = consigneeInfo;
        this.invoiceInfo = invoiceInfo;
        this.cvsStore = store;
    }

    public CreditCardInfo getCreditCardInfo() {
        return creditCardInfo;
    }

    public ConsumerInfo getConsumerInfo() {
        return consumerInfo;
    }

    public ConsigneeInfo getConsigneeInfo() {
        return consigneeInfo;
    }

    public Invoice getInvoiceInfo() {
        return invoiceInfo;
    }

    public CvsStore getCvsStore() {
        return cvsStore;
    }

    public boolean isAvailable() {
        return (null != getConsigneeInfo() && null != getConsumerInfo()) && (null != getCvsStore() || null != getCreditCardInfo());
    }

    @Override
    public EasyPayInfo deserialize(JsonElement jsonElement, Type typeOfT, JsonDeserializationContext context) throws JsonParseException {
        EasyPayInfo easyPayInfo = null;

        if (!jsonElement.isJsonNull()) {
            JsonObject jsonObject = jsonElement.getAsJsonObject();
            JsonElement value = jsonObject.get(KEY_ROOT);
            if (!value.isJsonNull()){
                easyPayInfo = new Gson().fromJson(jsonElement.toString(), EasyPayInfo.class);
            }
        }

        return easyPayInfo;
    }

}
