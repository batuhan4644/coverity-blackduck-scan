package com.demo.tests;

public class TestsVulnerable {

    public static void main(String[] args) {
        String username = new String("admin");

        if (username == "admin") {
            System.out.println("Admin user");
        }
    }
}