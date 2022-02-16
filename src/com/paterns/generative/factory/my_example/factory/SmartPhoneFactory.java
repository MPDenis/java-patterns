package com.paterns.generative.factory.my_example.factory;

import com.paterns.generative.factory.my_example.domain.SmartPhone;

public class SmartPhoneFactory {

    public static SmartPhone getSmartPhone(SmartPhoneAbstractFactory factory){
       return factory.createSmartPhone();
    }
}
