package com.company;

public class Porsche extends Car {
    public Porsche() {
        super("Porsche", true, 8, 2, "red");
    }

    @Override
    public String startEngine() {

        return "Porsche engine is running";
    }

    @Override
    public String accelerate(int speed) {

        return "Porsche is driving at: " + speed + " at 60 seconds";
    }

    @Override
    public String brake() {

        return "I am in the front window";
    }
}
