package com.demo.test2;

public class Test2Vulnerable {

    public static void main(String[] args) {
        String username = new String("admin");

        if (username == "admin") {
            System.out.println("Admin user");
        }
    }
}