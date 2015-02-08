package DriveSim.State;

import DriveSim.Vehicles.Car;

public class AccelerationState implements State {
    Car car;

    public AccelerationState(Car car) {
        this.car = car;
    }

    @Override
    public void turnKeyToStart() {
        System.out.println("The car is already started!");
    }

    @Override
    public void accelerate() {
        System.out.println("You are already accelerating!");
    }

    @Override
    public void brake() {
        System.out.println(car.getModel() + " is slowing down...the car has stopped moving!");
        car.setState(car.getOnState());
    }

    @Override
    public void turnKeyToStop() {
        System.out.println("You can't turn off the car while it is accelerating!");
    }
}