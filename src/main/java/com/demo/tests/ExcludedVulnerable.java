package com.demo.tests;

public class ExcludedVulnerable {

    public static void main(String[] args) {

        String legacyUser = null;

        printUsername(legacyUser);
    }

    public static void printUsername(String username) {

        System.out.println("Username length:");

        System.out.println(username.length());
    }
}