package com.game;

public class Main {

    public static void main(String[] args) {
        LifeSupportSystem lifeSupportSystem = new LifeSupportSystem();
        System.out.println("Current oxygen level: " + lifeSupportSystem.checkOxygenLevel());
    }
}