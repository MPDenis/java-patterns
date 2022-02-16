package com.paterns.generative.factory.my_example;

import com.paterns.generative.factory.my_example.domain.SmartPhone;
import com.paterns.generative.factory.my_example.factory.AndroidSmartPhoneFactory;
import com.paterns.generative.factory.my_example.factory.SmartPhoneAbstractFactory;
import com.paterns.generative.factory.my_example.factory.SmartPhoneFactory;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Main {
    /**
     *       ---------- Шаги реализации -------------
     * Создайте таблицу соотношений типов продуктов к вариациям семейств продуктов.
     *
     * Сведите все вариации продуктов к общим интерфейсам.
     *
     * Определите интерфейс абстрактной фабрики. Он должен иметь фабричные методы для создания каждого из типов продуктов.
     *
     * Создайте классы конкретных фабрик, реализовав интерфейс абстрактной фабрики. Этих классов должно быть столько же,
     * сколько и вариаций семейств продуктов.
     *
     * Измените код инициализации программы так, чтобы она создавала определённую фабрику и передавала её в клиентский код.
     *
     * Замените в клиентском коде участки создания продуктов через конструктор вызовами соответствующих методов фабрики.
     * @param args
     */

    public static void main(String[] args) {

        SmartPhoneAbstractFactory factory1 = new AndroidSmartPhoneFactory("ANDROID", 4, "Galaxy S18");
        SmartPhoneAbstractFactory factory2 = new AndroidSmartPhoneFactory("IOS", 6, "Iphone 12 PRO");

        SmartPhone smartPhone1 = SmartPhoneFactory.getSmartPhone(factory1);
        SmartPhone smartPhone2 = SmartPhoneFactory.getSmartPhone(factory2);

        System.out.println(smartPhone2);
        System.out.println(smartPhone1);
//
    }

}
