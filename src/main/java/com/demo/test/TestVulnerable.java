package com.demo.test;

public class TestVulnerable {

    public static void main(String[] args) {
        String username = new String("admin");

        if (username == "admin") {
            System.out.println("Admin user");
        }
    }
}