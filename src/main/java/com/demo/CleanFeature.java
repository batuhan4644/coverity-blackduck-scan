package com.demo;

public class CleanFeature {

    public static void main(String[] args) {

        String username = "Batuhan";

        printUsername(username);
    }

    public static void printUsername(String username) {

        if (username != null) {
            System.out.println("Username: " + username);
        }
    }
}