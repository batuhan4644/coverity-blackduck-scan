package com.demo.tests;

public class DivisionByZeroTest {

    public static void main(String[] args) {

        int total = 100;
        int divisor = 0;

        int result = total / divisor;

        System.out.println("Result: " + result);
    }
}