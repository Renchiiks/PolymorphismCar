package com.company;

public class Volvo extends Car {

    public Volvo() {
        super("Volvo", true, 6, 5, "blue");
    }

    @Override
    public String accelerate(int speed) {

        return "Volvo is accelerating";
    }
}
