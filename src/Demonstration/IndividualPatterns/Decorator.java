package Demonstration.IndividualPatterns;

import DriveSim.Decorator.*;
import DriveSim.Vehicles.AstonMartin.DB9;
import DriveSim.Vehicles.Car;

public class Decorator {
    //The decorator pattern attaches additional responsibilities to an object dynamically
    //It is an alternative to subclassing
    //In this example: A concrete car modification garage component can be wrapped with multiple decorators
    //The decorators are modifications (e.g. alloys)
    //The Car class has a field for modifications

    public static void main(String[] args) {
        //Creating a car modification garage
        //It has been wrapped (i.e. decorated) with three modifications
        //1.Alloys, 2.LeatherInterior, 3.Rear Spoiler
        CarModification modifications = new RearSpoiler(new LeatherInterior(new Alloys(new ExpensiveModificationGarage())));

        //View the modifications
        System.out.println("***Modifications Package***");
        System.out.println(modifications.toString() + "\n");

        //Manually creating a car object to test
        Car db9 = new DB9();

        //Setting the cars modifications
        db9.setModifications(modifications);

        System.out.println("***Car with Modifications***");
        db9.print();
    }
}