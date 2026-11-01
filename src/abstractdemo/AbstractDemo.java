package abstractdemo;

import java.util.ArrayList;
import java.util.List;

public class AbstractDemo {
    public static void main(String[] args) {
        List<Vehicle> vehicles = new ArrayList<>();
        vehicles.add(new Car());
        vehicles.add(new Bike());

        for (Vehicle vehicle: vehicles){
            vehicle.start();
            System.out.println(vehicle.getWheels());
        }
       //  Vehicle v2 = new Vehicle(4);   // uncomment later and read the error
    }
}

abstract class Vehicle{
    private int wheels=0;
    Vehicle(int wheels){
        this.wheels = wheels;
    };
    public abstract void start();

    public int getWheels(){
        return wheels;
    }
}
class Car extends Vehicle{
    public Car(){
        super(4);
    }

    @Override
    public void start() {
        System.out.println("Car start");
    }
  }
class Bike extends Vehicle{
    public Bike(){
        super(2);
    }
    @Override
    public void start() {
        System.out.println("Pedal the bike");
    }
}