package DriveSim.Observer;

import DriveSim.Template.Driver;
import DriveSim.Vehicles.Car;

import java.util.ArrayList;
import java.util.List;

public class GameMap implements ISubject{
    private List<IObserver> observers;
    private List<Car> cars;
    private List<Driver> drivers;

    public GameMap(){
        this.observers = new ArrayList<IObserver>();
        this.cars = new ArrayList<Car>();
        this.drivers = new ArrayList<Driver>();
    }

    @Override
    public void registerObserver(IObserver observer) {
        this.observers.add(observer);
    }

    @Override
    public void removeObserver(IObserver observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for(IObserver o : observers){
            o.update(cars.size(),drivers.size());
        }
    }

    public void mapUpdated(){
        this.notifyObservers();
    }

    public void spawnCar(Car car){
        if(!cars.contains(car)) {
            cars.add(car);
            this.mapUpdated();
        }
    }

    public void despawnCar(Car car){
        if(cars.contains(car)) {
            cars.remove(car);
            this.mapUpdated();
        }
    }

    public void spawnDriver(Driver driver){
        if(!drivers.contains(driver)) {
            drivers.add(driver);
            this.mapUpdated();
        }
    }

    public void despawnDriver(Driver driver){
        if(drivers.contains(driver)) {
            drivers.remove(driver);
            this.mapUpdated();
        }
    }
}