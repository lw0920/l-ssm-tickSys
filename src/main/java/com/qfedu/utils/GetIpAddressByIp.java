package com.qfedu.utils;

import com.qfedu.getCountryCityByIp.ArrayOfString;
import com.qfedu.getCountryCityByIp.IpAddressSearchWebService;

public class GetIpAddressByIp {

    public static String getIpAddressByIp(String iPstr) {
        String ipAddress ="";
        IpAddressSearchWebService service = new IpAddressSearchWebService();
        ArrayOfString countryCityByIp = service.getIpAddressSearchWebServiceSoap().getCountryCityByIp(iPstr);
        // System.out.println(countryCityByIp.getString().get(1));
        ipAddress = countryCityByIp.getString().get(1);
        if (countryCityByIp.getString().get(1).contains("局域网")) {
            ipAddress = "河南郑州 自家网";
        }
        return ipAddress;
    }
}