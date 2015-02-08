package Demonstration;

import DriveSim.Adapter.*;
import DriveSim.Composite.*;
import DriveSim.Decorator.*;
import DriveSim.Factory.*;
import DriveSim.Observer.*;
import DriveSim.Strategy.*;
import DriveSim.Template.*;
import DriveSim.Vehicles.*;

import java.awt.*;

public class AllPatterns {
    //In this example: A demonstration of the entire framework using all 8 implemented design patterns

    public static void main(String[] args) {
        //Factory - creating Cars
        System.out.println("***Building Cars in a Factory***");
        CarFactory ferrariFactory = new FerrariFactory();
        CarFactory audiFactory = new AudiFactory();
        CarFactory astonMartinFactory = new AstonMartinFactory();

        Car f12 = ferrariFactory.buildCar(CarType.FERRARI_F12, Color.RED);
        f12.print();

        Car a4 = audiFactory.buildCar(CarType.AUDI_A4, Color.BLACK);
        a4.print();

        Car db9 = astonMartinFactory.buildCar(CarType.ASTON_MARTIN_DB9,Color.BLUE);
        db9.print();

        //Decorator - decorating a car with some modifications
        System.out.println("***Decorating a Car with Modifications***");
        CarModification mods = new RearSpoiler(new LeatherInterior(new Alloys(new CheapModificationGarage())));
        db9.setModifications(mods);
        System.out.println(mods.toString() + "\n");
        db9.print();

        //Strategy - changing a cars behaviour
        System.out.println("***Changing Car Behaviours***");
        f12.setEngine(new TurboEngine());
        f12.setTransmission(new AutomaticTransmission());
        f12.startEngine();
        f12.gearUp();
        f12.gearUp();
        f12.stopEngine();

        a4.setTransmission(new AutomaticTransmission());
        a4.startEngine();
        a4.gearUp();
        a4.stopEngine();

        //Adapter - using the ExperimentalEngine type in our framework
        System.out.println("\n***Using an Adapter***");
        db9.setEngine(new ExperimentalEngineAdapter(new ElectromagneticEngine()));

        db9.startEngine();
        db9.stopEngine();

        System.out.println("\n***Controlling the Cars State***");
        db9.accelerate();
        db9.brake();
        db9.startEngine();
        db9.accelerate();
        db9.stopEngine();
        db9.brake();
        db9.stopEngine();

        //Template Method - allowing a drivers drive algorithm to decide how they control the car
        System.out.println("\n***Driving a Car with the Template Method***");
        Driver racer = new RaceDriver("Darren");
        racer.print();
        racer.drive(f12);

        //Observer - spawning/despawning items from the game map and updating the generic game display
        System.out.println("\n***Observing the Game Map***");
        GameMap map = new GameMap();
        GenericGameMapDisplay mapDisplay = new GenericGameMapDisplay(map);

        map.spawnCar(f12);
        map.spawnCar(a4);
        map.spawnDriver(racer);
        map.spawnCar(db9);

        map.despawnCar(a4);
        map.despawnDriver(racer);

        //Composite - adding game items to a tree and printing it out
        System.out.println("***Creating a Composite Tree***");
        GameComponent gameItems = new GameItemComposite("Game Items");
        GameComponent activeItems = new GameItemComposite("Active Items");
        GameComponent inactiveItems = new GameItemComposite("Inactive Items");
        gameItems.add(activeItems);
        gameItems.add(inactiveItems);

        activeItems.add(f12);
        activeItems.add(db9);

        inactiveItems.add(a4);
        inactiveItems.add(racer);

        gameItems.print();
    }
}