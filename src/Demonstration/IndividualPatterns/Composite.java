package Demonstration.IndividualPatterns;

import DriveSim.Composite.GameComponent;
import DriveSim.Composite.GameItemComposite;
import DriveSim.Template.Driver;
import DriveSim.Template.NoobDriver;
import DriveSim.Template.RaceDriver;
import DriveSim.Vehicles.AstonMartin.DB9;
import DriveSim.Vehicles.Audi.A4;
import DriveSim.Vehicles.Car;
import DriveSim.Vehicles.Ferrari.Enzo;
import DriveSim.Vehicles.Ferrari.F12;

public class Composite {
    //The composite pattern allows one to compose objects into tree structures representing whole-part hierarchies
    //It lets clients treat individual objects and compositions of object uniformly
    //In this example: Cars and Drivers are each Game Components
    //The GameItemComposite can be used to represent these objects in a tree

    public static void main(String[] args) {
        //Creating the composite tree structure
        GameComponent gameItems = new GameItemComposite("Game Items");
        GameComponent activeItems = new GameItemComposite("Active Items");
        GameComponent inactiveItems = new GameItemComposite("Inactive Items");
        gameItems.add(activeItems);
        gameItems.add(inactiveItems);

        //Manually create some game items and add them to the tree
        Car f12 = new F12();
        Car db9 = new DB9();
        Car a4 = new A4();
        Car enzo = new Enzo();
        Driver noob = new NoobDriver("Mike Patterns");
        Driver racer = new RaceDriver("Speedy Dunlop");

        activeItems.add(f12);
        activeItems.add(db9);
        activeItems.add(enzo);
        activeItems.add(racer);

        inactiveItems.add(a4);
        inactiveItems.add(noob);

        //Print the entire tree structure by calling the print method on the root node
        gameItems.print();
    }
}