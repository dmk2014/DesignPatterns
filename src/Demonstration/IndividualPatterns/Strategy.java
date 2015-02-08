package Demonstration.IndividualPatterns;

import DriveSim.Strategy.AutomaticTransmission;
import DriveSim.Strategy.EnhancedEngine;
import DriveSim.Vehicles.AstonMartin.DB9;
import DriveSim.Vehicles.Car;

public class Strategy {
    //The strategy pattern allows an object to change behaviour at runtime
    //In this example: Car Transmission & Engine behaviour can change at runtime

    public static void main(String[] args) {
        //Default constructor uses manually transmission & standard engine type
        Car car = new DB9();

        car.print();

        System.out.println("***Initial Car Behaviour***");
        car.gearUp();
        car.gearDown();
        car.startEngine();
        car.stopEngine();

        //Use of Strategy:
        //Inject automatic transmission
        //Inject enhanced engine

        System.out.println("\n***Strategy Injections***");
        car.setTransmission(new AutomaticTransmission());
        car.setEngine(new EnhancedEngine());

        System.out.println("\n***Modified Car Behaviour***");
        car.gearUp();
        car.gearDown();
        car.startEngine();
        car.stopEngine();
    }
}