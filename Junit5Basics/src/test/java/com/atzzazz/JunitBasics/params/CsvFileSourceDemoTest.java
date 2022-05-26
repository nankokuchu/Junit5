package com.atzzazz.JunitBasics.params;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

public class CsvFileSourceDemoTest {

    @ParameterizedTest
    @CsvFileSource(resources = {"/data.csv"})
    void csvFileSourceDemo(String name, Integer price) {
        System.out.println(name + "的价格是" + price + "元");
    }
}
