package Demonstration.IndividualPatterns;

import DriveSim.Vehicles.Audi.R8;
import DriveSim.Vehicles.Car;

public class State {
    //The state pattern allows an object to alter its behaviour when it's internal state changes
    //The object will appear to change its class
    //In this example: Each car has three states: On, Off and Accelerating
    //A car in the Off state can move to the On state
    //Once the car is in the On state it may Accelerate or go to the Off state
    //In the Accelerating state it may brake and return to the On state

    public static void main(String[] args) {
        //Manually create a car object to test
        Car r8 = new R8();

        System.out.println("***Observing The Car Changing States***");
        r8.startEngine();
        r8.accelerate();
        r8.brake();
        r8.stopEngine();

        System.out.println("\n***Invalid State Transitions***");
        r8.accelerate();
        r8.brake();
        r8.stopEngine();
    }
}