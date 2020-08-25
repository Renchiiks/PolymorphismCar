package com.company;

public class BMW extends Car{
    public BMW() {
        super("BMW", true, 6, 5, "Silver");
    }

    @Override
    public String startEngine() {
        return "BMW is started";
    }

    @Override
    public String accelerate(int speed) {
        return "BMW is accelerating";
    }


}
