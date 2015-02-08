package DriveSim.Factory;

import DriveSim.Vehicles.AstonMartin.DB9;
import DriveSim.Vehicles.AstonMartin.Vanquish;
import DriveSim.Vehicles.Car;
import DriveSim.Vehicles.CarType;

import java.awt.*;

public class AstonMartinFactory extends CarFactory {
    @Override
    public Car buildCar(CarType model, Color color) {
        Car c = null;

        if(model == CarType.ASTON_MARTIN_DB9) {
            c = new DB9();
            c.setColor(color);
        }
        else if(model == CarType.ASTON_MARTIN_VANQUISH) {
            c = new Vanquish();
            c.setColor(color);
        }

        return c;
    }
}