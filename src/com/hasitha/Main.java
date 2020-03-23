package com.hasitha;

import com.hasitha.Phone;

import java.math.BigDecimal;

public class Main {

    public static void main(String[] args) {
	 Phone p=new Phone.Builder().setOs("Android").setCompany("Huawei").setPrice(new BigDecimal(12500)).build();
        System.out.println(p);
    }
}
