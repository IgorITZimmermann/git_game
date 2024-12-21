package com.game;

public class NavigationSystem {
    private String currentDestination;

    public void setDestination(String destination){
        currentDestination = destination;
    }

    public String calculateRoute(){
        return "Route to Mars via coordinates " + currentDestination;
    }
}
