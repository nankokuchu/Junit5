package com.atzzazz.JunitBasics;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ExampleTest {

    @BeforeAll
    static void setUpAll(){
        System.out.println(" @BeforeAll=========");
    }

    @BeforeEach
    void setUp() {
        System.out.println("@BEforeEach注解");
    }

    @Test
    @DisplayName("别名")
    void print_method1() {
        System.out.println("自动生成Test1");
        assertEquals(2,1+1);
    }

    @Test
    @DisplayName("别名")
    void print_method2() {
        System.out.println("自动生成Test2");
        assertEquals(2,1+1);
    }

    @Test
    @DisplayName("别名")
    void print_method3() {
        System.out.println("asserTimeout");
    }
}