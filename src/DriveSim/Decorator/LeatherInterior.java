package DriveSim.Decorator;

/**
 * Created by Darren on 20/12/2014.
 */
public class LeatherInterior extends ModificationDecorator{
    CarModification modification;

    public LeatherInterior(CarModification modification){
        this.modification = modification;
    }

    @Override
    public double getPrice() {
        return modification.getPrice() + 700;
    }

    @Override
    public String toString() {
        return modification.toString() + "\nModification: Leather Interior";
    }
}