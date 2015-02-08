package Demonstration.IndividualPatterns;

import DriveSim.Factory.AstonMartinFactory;
import DriveSim.Factory.AudiFactory;
import DriveSim.Factory.CarFactory;
import DriveSim.Factory.FerrariFactory;
import DriveSim.Vehicles.Car;
import DriveSim.Vehicles.CarType;

import java.awt.*;

public class Factory {
    //The factory method defines an interface for creating objects
    //Subclasses decide which class to instantiate
    //In this example: Cars are constructed using car factories

    public static void main(String[] args) {
        //Creating factories: 3 car factories available
        CarFactory astonMartinFactory = new AstonMartinFactory();
        CarFactory audiFactory = new AudiFactory();
        CarFactory ferrariFactory = new FerrariFactory();

        //The factories can build cars based on the type supplied
        //Type is supplied using an enum -> provides type safety & improves readability
        Car db9 = astonMartinFactory.buildCar(CarType.ASTON_MARTIN_DB9, Color.BLACK);
        Car vanquish = astonMartinFactory.buildCar(CarType.ASTON_MARTIN_VANQUISH,Color.BLUE);

        Car a4 = audiFactory.buildCar(CarType.AUDI_A4,Color.GRAY);
        Car r8 = audiFactory.buildCar(CarType.AUDI_R8,Color.GREEN);

        Car enzo = ferrariFactory.buildCar(CarType.FERRARI_ENZO,Color.RED);
        Car f12 = ferrariFactory.buildCar(CarType.FERRARI_F12,Color.RED);

        System.out.println("***Cars Created Using Factories***\n");

        System.out.println("***Aston Martin***");
        db9.print();
        vanquish.print();

        System.out.println("***Audi***");
        a4.print();
        r8.print();

        System.out.println("***Ferrari***");
        enzo.print();
        f12.print();
    }
}