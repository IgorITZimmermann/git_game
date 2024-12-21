package com.game;

public class LifeSupportSystem {
    private double oxygenLevel = 100.0;
    public double checkOxygenLevel() {
        return oxygenLevel;
    }
    public void useOxygen(double amount) {
        if (amount > oxygenLevel) {
            oxygenLevel = 0;
        } else oxygenLevel = oxygenLevel - amount;
    }
    public void refillOxygen(double amount) {
        oxygenLevel = oxygenLevel + amount;

    }
}
