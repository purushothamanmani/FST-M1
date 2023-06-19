package activities;

interface BicycleParts {
    public int gears = 0;
    public int currentSpeed = 0;
}

interface BicycleOperation {
    public void applyBrake(int decrease);

    public void speedUp(int increase);
}

class Bicycle implements BicycleParts, BicycleOperation {
    public int gear;
    public int currentSpeed;

    public Bicycle(int gear, int currentSpeed) {
        this.gear = gear;
        this.currentSpeed = currentSpeed;
    }

    @Override
    public void applyBrake(int decrease) {
        currentSpeed -= decrease;
        System.out.println("Bicycle speed down:" + currentSpeed);
    }

    @Override
    public void speedUp(int increase) {
        currentSpeed += increase;
        System.out.println("Bicycle speed up:" + currentSpeed);
    }

    public String bicycleDesc() {
        return ("No of gear:" + gear + "\n" + "No of speed:" + currentSpeed);

    }
}

class MountainBike extends Bicycle {
    public int seatHeight;

    public MountainBike(int gear, int currentSpeed, int seatHeight) {
        super(gear, currentSpeed);
        this.seatHeight = seatHeight;
    }

    public void setSeatHeight(int updateValue) {
        seatHeight = updateValue;

    }

    public String bicycleDesc() {
        return (super.bicycleDesc() + "\n" + "Bicycle seat height:" + seatHeight);
    }
}

public class Activity7 {
    public static void main(String[] args) {
        MountainBike mb = new MountainBike(2, 5, 20);
        System.out.println(mb.bicycleDesc());
        mb.speedUp(25);
        mb.applyBrake(8);

    }
}
