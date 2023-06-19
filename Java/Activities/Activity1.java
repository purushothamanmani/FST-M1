package activities;
class Car {
    public String color;
    public String transmission;
    public int make;
    public int tyres;
    public int doors;

    public Car() {
        tyres = 4;
        doors = 4;
    }

    public void displayCharacteristics() {
        System.out.println("Vehicle color:" + color);
        System.out.println("Vehicle transmission:" + transmission);
        System.out.println("Vehicle make:" + make);
        System.out.println("Vehicle no of tyres:" + tyres);
        System.out.println("Vehicle no of doors:" + doors);
    }

    public void accelerate() {
        System.out.println("Car is moving forward");
    }

    public void brake() {
        System.out.println("Car has stopped");
    }
}

public class Activity1 {
    public static void main(String[] args) {
        Car car = new Car();
        car.color = "Black";
        car.make = 2014;
        car.transmission = "Manual";
        car.displayCharacteristics();
        car.accelerate();
        car.brake();
    }
}
