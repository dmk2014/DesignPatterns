package Demonstration.IndividualPatterns;

import DriveSim.Observer.GameMap;
import DriveSim.Observer.GenericGameMapDisplay;
import DriveSim.Template.Driver;
import DriveSim.Template.RaceDriver;
import DriveSim.Vehicles.AstonMartin.DB9;
import DriveSim.Vehicles.Audi.A4;
import DriveSim.Vehicles.Car;

public class Observer {
    //The observer pattern defines a one to many relationship between objects
    //When one object changes state, all its dependants are notified & updated automatically
    //In this example: Game objects are spawned and despawned from the game map
    //The game map notifies its display(s) and they are updated

    public static void main(String[] args) {
        //Creating the game map (the observable/subject)
        GameMap map = new GameMap();
        //Creating one observer - a generic game map display -> Shows details of the game
        GenericGameMapDisplay mapDisplay = new GenericGameMapDisplay(map);

        //Manually creating some game objects to test
        Car db9 = new DB9();
        Car a4 = new A4();
        Driver driver = new RaceDriver("Bob Patterns");

        //Spawn & despawn objects on the map
        //The map (observable) updates its observers each time
        //In this case the generic display refreshes details of the game
        map.spawnCar(db9);
        map.spawnDriver(driver);
        map.spawnCar(a4);

        map.despawnCar(db9);
        map.despawnDriver(driver);
    }
}