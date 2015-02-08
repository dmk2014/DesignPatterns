package Demonstration.IndividualPatterns;

import DriveSim.Adapter.BiofuelEngine;
import DriveSim.Adapter.ElectromagneticEngine;
import DriveSim.Adapter.ExperimentalEngineAdapter;
import DriveSim.Strategy.IEngineBehaviour;
import DriveSim.Vehicles.Car;
import DriveSim.Vehicles.Ferrari.Enzo;

public class Adapter {
    //The adapter patterns converts the interface of a class into another interface clients expect
    //Lets otherwise incompatible classes work together
    //In this example: adapt the IExperimentalEngine interface to our IEngineBehaviour
    //Our clients can now use these experimental engines in their cars

    public static void main(String[] args) {
        //Create the adapted object
        //Note that the Electromagnetic and Biofuel engines are of the IExperimentalEngine type
        //We are adapting them to the IEngineBehaviour type
        IEngineBehaviour electromagneticEngine = new ExperimentalEngineAdapter(new ElectromagneticEngine());
        IEngineBehaviour biofuelEngine = new ExperimentalEngineAdapter(new BiofuelEngine());

        //Manually create a car to test
        Car enzo = new Enzo();

        System.out.println("***Default Engine***");
        enzo.startEngine();
        enzo.stopEngine();

        //Set engine type using strategy pattern (see Strategy demonstration class)
        System.out.println("\n***Adapted Engines***");
        System.out.println("***Electromagnetic Engine***");
        enzo.setEngine(electromagneticEngine);
        enzo.startEngine();
        enzo.stopEngine();

        System.out.print("\n***Biofuel Engine***");
        enzo.setEngine(biofuelEngine);
        enzo.startEngine();
        enzo.stopEngine();
    }
}