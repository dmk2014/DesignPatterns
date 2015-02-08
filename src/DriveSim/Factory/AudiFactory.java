package DriveSim.Factory;

import DriveSim.Vehicles.Audi.A4;
import DriveSim.Vehicles.Audi.R8;
import DriveSim.Vehicles.Car;
import DriveSim.Vehicles.CarType;

import java.awt.*;

public class AudiFactory extends CarFactory {
    @Override
    public Car buildCar(CarType model, Color color) {
        Car c = null;

        if(model == CarType.AUDI_A4) {
            c = new A4();
            c.setColor(color);
        }
        else if(model == CarType.AUDI_R8) {
            c = new R8();
            c.setColor(color);
        }

        return c;
    }
}