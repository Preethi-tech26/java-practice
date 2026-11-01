package interfaces;

import java.util.ArrayList;
import java.util.List;

public class StartableDemo {
    public static void main(String[] args) {
        List<Startable> things = new ArrayList<>();
        things.add(new Car());
        things.add(new Bike());
        things.add(new Lawnmower());

        for (Startable s : things) {
            s.start();
        }
    }
}

interface Startable {
    void start();
}

class Car implements Startable {
    @Override
    public void start() {
        System.out.println("Car start");
    }
}

class Bike implements Startable {
    public void start() {
        System.out.println("Pedal to start");
    }
}

class Lawnmower implements Startable {
   public void start() {
        System.out.println("Pull the chord");
    }
}
