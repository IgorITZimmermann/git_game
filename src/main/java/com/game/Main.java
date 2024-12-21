package com.game;

public class Main {
    public static void main(String[] args) {
        NavigationSystem navigationSystem = new NavigationSystem();
        navigationSystem.setDestination("X:100 Y:200");
        System.out.println(navigationSystem.calculateRoute());
    }
}