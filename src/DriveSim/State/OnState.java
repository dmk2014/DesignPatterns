package DriveSim.State;

import DriveSim.Vehicles.Car;

public class OnState implements State {
    Car car;

    public OnState(Car car) {
        this.car = car;
    }

    @Override
    public void turnKeyToStart() {
        System.out.println("The car is already started!");
    }

    @Override
    public void accelerate() {
        System.out.println(car.getModel() + " is cruising!");
        car.setState(car.getAccelerationState());
    }

    @Override
    public void brake() {
        System.out.println("There is no need to brake - you are not accelerating!");
    }

    @Override
    public void turnKeyToStop() {
        car.getEngine().stop();
        car.setState(car.getOffState());
    }
}