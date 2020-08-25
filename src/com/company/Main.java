package com.company;

public class Main {

    public static void main(String[] args) {
        for (int i = 0; i <= 5; i++) {
            Car car = randomCar();
            System.out.println("Car " + car.getName() + "\n" + car.startEngine() +" "+ car.accelerate(50) +" "+ car.brake());
        }

    }

    public static Car randomCar() {
        int randomNUmber = (int) (Math.random() * 3) + 1;
        System.out.println("Random number - " + randomNUmber);

        switch (randomNUmber) {
            case 1:
                return new BMW();
            case 2:
                return new Volvo();
            case 3:
                return new Porsche();
        }
        return null;
    }
}
