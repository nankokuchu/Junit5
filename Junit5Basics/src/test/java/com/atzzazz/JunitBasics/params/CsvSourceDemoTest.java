package com.atzzazz.JunitBasics.params;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import java.awt.datatransfer.StringSelection;

public class CsvSourceDemoTest {

    @ParameterizedTest
    @CsvSource({"苹果", "芒果"})
    void csvSourceDemo(String name) {
        System.out.println(name);
    }

    @ParameterizedTest
    @CsvSource({"苹果,20", "芒果,50"})
    void csvSourceDemo1(String name, Integer price) {
        System.out.println(name+"的价格是"+price+"元");
    }

    @ParameterizedTest
    @CsvSource(value = {"苹果-20", "芒果,-50"},delimiterString = "-")
    void csvSourceDemo2(String name, Integer price) {
        System.out.println(name+"的价格是"+price+"元");
    }
}
