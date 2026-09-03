package com.demo;

public class Vulnerable {

    public static void main(String[] args) {

        String username = null;

        System.out.println("Username length: " + username.length());
    }
}