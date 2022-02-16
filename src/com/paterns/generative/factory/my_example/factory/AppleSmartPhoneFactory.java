package com.paterns.generative.factory.my_example.factory;

import com.paterns.generative.factory.my_example.domain.AndroidSmartPhone;
import com.paterns.generative.factory.my_example.domain.SmartPhone;

public class AppleSmartPhoneFactory implements SmartPhoneAbstractFactory {

    private String OS;
    private int RAM;
    private String model;

    public AppleSmartPhoneFactory(String OS, int RAM, String model) {
        this.OS = OS;
        this.RAM = RAM;
        this.model = model;
    }

    @Override
    public SmartPhone createSmartPhone() {
        return new AndroidSmartPhone(this.OS, this.RAM, this.model);
    }
}
