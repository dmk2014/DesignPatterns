package Demonstration.IndividualPatterns;

import DriveSim.Template.Driver;
import DriveSim.Template.ExperiencedDriver;
import DriveSim.Template.NoobDriver;
import DriveSim.Vehicles.Car;
import DriveSim.Vehicles.Ferrari.F12;

public class Template {
    //The template method pattern defines the skeleton of an algorithm in a method and defers some steps to subclasses
    //It allows subclasses to redefine certain steps of the algorithm without changing its structure
    //In this example: Template method defines the actions of a driver (Turn on, drive car, brake car, turn off)
    //Drive and brake are abstract and each driver concrete class must implement this functionality

    public static void main(String[] args) {
        //Create two drivers to test
        //The Driver class provides the template method
        System.out.println("***Our Test Drivers***");
        Driver noob = new NoobDriver("Bob Patterns");
        noob.print();

        Driver experiencedDriver = new ExperiencedDriver("Stack Trace");
        experiencedDriver.print();

        //Manually create a car to test
        Car f12 = new F12();

        //Test out the algorithms
        //Note different and acceleration and braking behaviours
        System.out.println("***Noob Driver Algorithm***");
        noob.drive(f12);

        System.out.println("\n***Experienced Driver Algorithm***");
        experiencedDriver.drive(f12);
    }
}