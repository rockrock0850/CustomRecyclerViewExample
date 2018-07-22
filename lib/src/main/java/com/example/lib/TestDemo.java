package com.example.lib;

import com.google.gson.Gson;

import org.apache.commons.lang3.builder.ReflectionToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

public class TestDemo {

    public static void main (String[] arg0) {
//        String json = "{\"easyPayInfo\":{\"creditCardInfo\":{\"number\":\"3560500100023014\",\"name\":\"顆顆\",\"expiration\":\"202812\"},\"consumerInfo\":{\"name\":\"QA1\",\"email\":\"ting_chiou@hiiir.com\",\"addr\":{\"zip\":\"105\",\"city\":1,\"county\":1,\"full_addr\":\"台北市松山區港淺路200號\",\"addr\":\"港淺路200號\"},\"tel\":null,\"mobile\":\"0903928826\"},\"consigneeInfo\":{\"name\":\"QA1\",\"email\":\"ting_chiou@hiiir.com\",\"addr\":{\"zip\":null,\"city\":1,\"county\":10,\"full_addr\":null,\"addr\":\"港淺路20000號\"},\"tel\":null,\"mobile\":\"0903928826\",\"id\":null,\"memo\":null},\"invoiceInfo\":{\"donationInfo\":{\"id\":\"null\",\"name\":null,\"donate\":false},\"type\":\"E_COPIES\",\"device\":null,\"recipient\":\"QA1\",\"address\":{\"zip\":null,\"city\":1,\"county\":10,\"full_addr\":null,\"addr\":\"港淺路200號\"},\"vat\":null,\"company\":null,\"requestInvoice\":false,\"eInvoiceMemberVehicleNum\":null,\"invoiceProcessMethod\":null}}}";
//        String json = "{\"easyPayInfo\":{\"creditCardInfo\":{\"number\":\"3560500100023014\",\"name\":\"顆顆\",\"expiration\":\"202812\"},\"consumerInfo\":{\"name\":\"QA1\",\"email\":\"ting_chiou@hiiir.com\",\"addr\":{\"zip\":\"105\",\"city\":1,\"county\":1,\"full_addr\":\"台北市松山區港淺路200號\",\"addr\":\"港淺路200號\"},\"tel\":null,\"mobile\":\"0903928826\"},\"consigneeInfo\":{\"name\":\"QA1\",\"email\":\"ting_chiou@hiiir.com\",\"addr\":{\"zip\":null,\"city\":1,\"county\":10,\"full_addr\":null,\"addr\":\"港淺路20000號\"},\"tel\":null,\"mobile\":\"0903928826\",\"id\":null,\"memo\":null},\"invoiceInfo\":{\"donationInfo\":{\"id\":\"null\",\"name\":null,\"donate\":false},\"type\":\"E_COPIES\",\"device\":null,\"recipient\":\"QA1\",\"address\":{\"zip\":null,\"city\":1,\"county\":10,\"full_addr\":null,\"addr\":\"港淺路200號\"},\"vat\":null,\"company\":null,\"requestInvoice\":false,\"eInvoiceMemberVehicleNum\":null,\"invoiceProcessMethod\":null}}}";
//        String json = "{\"easyPayInfo\":{\"creditCardInfo\":{\"number\":\"3560500100023014\",\"name\":\"顆顆\",\"expiration\":\"202812\"},\"consumerInfo\":{\"name\":\"QA1\",\"email\":\"ting_chiou@hiiir.com\",\"addr\":{\"zip\":\"105\",\"city\":1,\"county\":1,\"full_addr\":\"台北市松山區港淺路200號\",\"addr\":\"港淺路200號\"},\"tel\":null,\"mobile\":\"0903928826\"}}}";
//        String json = "{\"test\":\"12345\"}";
//        EasyPayInfoVO info = new Gson().fromJson(json, EasyPayInfoVO.class);
//        System.out.println(ReflectionToStringBuilder.toString(info.getEasyPayInfo(), ToStringStyle.SHORT_PREFIX_STYLE));
//        System.out.println(ReflectionToStringBuilder.toString(info.getEasyPayInfo().getConsumerInfo(), ToStringStyle.SHORT_PREFIX_STYLE));
//        System.out.println(ReflectionToStringBuilder.toString(info.getEasyPayInfo().getConsumerInfo().getAddr(), ToStringStyle.SHORT_PREFIX_STYLE));
//        System.out.println(ReflectionToStringBuilder.toString(info.getEasyPayInfo().getCreditCardInfo(), ToStringStyle.SHORT_PREFIX_STYLE));

        String json = "{\"type\":\"E_COPIES\"}";
        EasyPayInfoVO e = new Gson().fromJson(json, EasyPayInfoVO.class);
        System.out.println(ReflectionToStringBuilder.toString(e, ToStringStyle.SHORT_PREFIX_STYLE));
        System.out.println(Type.E_COPIES.ordinal());
        System.out.println(Type.E_COPIES.toString());
        System.out.println(Type.E_COPIES_2.ordinal());
        System.out.println(Type.E_COPIES_2.toString());
    }

}
