package activities;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

class Plane {
    private List<String> passenger;
    private int maxPassenger;
    private Date lastTimeTakeOf;
    private Date lastTimeLanded;

    public Plane(int maxPassenger) {
        this.maxPassenger = maxPassenger;
        passenger = new ArrayList<>();
    }
    public void onBoard(String passenger){
        this.passenger.add(passenger);
    }
    public Date takeOff(){
        lastTimeTakeOf=new Date();
        return lastTimeTakeOf;
    }
    public void land(){
        lastTimeLanded=new Date();
        passenger.clear();

    }
    public Date getLastTimeLanded(){
        return lastTimeLanded;
    }
    public List<String> getPassenger(){
        return passenger;
    }
}

public class Activity6 {
    public static void main(String[] args) throws InterruptedException {
        Plane plane=new Plane(10);
        plane.onBoard("Sachin");
        plane.onBoard("Subman");
        plane.onBoard("Vetri");
        plane.onBoard("ABD");
        System.out.println("Plane take off date: "+plane.takeOff());
        System.out.println("List of passenger names: "+plane.getPassenger());
        Thread.sleep(5000);
        plane.land();
        System.out.println("Plan landed date: "+plane.getLastTimeLanded());
    }
}
