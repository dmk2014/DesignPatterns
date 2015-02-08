package DriveSim.Factory;

import DriveSim.Vehicles.Car;
import DriveSim.Vehicles.CarType;
import DriveSim.Vehicles.Ferrari.Enzo;
import DriveSim.Vehicles.Ferrari.F12;

import java.awt.*;

public class FerrariFactory extends CarFactory{

    @Override
    public Car buildCar(CarType model, Color color) {
        Car c = null;

        if(model == CarType.FERRARI_F12) {
            c = new F12();
            c.setColor(color);
        }
        else if(model == CarType.FERRARI_ENZO) {
            c = new Enzo();
            c.setColor(color);
        }
        return c;
    }
}