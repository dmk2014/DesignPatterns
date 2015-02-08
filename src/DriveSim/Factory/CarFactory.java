package DriveSim.Factory;

import DriveSim.Vehicles.Car;
import DriveSim.Vehicles.CarType;

import java.awt.*;

public abstract class CarFactory {
    public abstract Car buildCar(CarType model, Color color);
}