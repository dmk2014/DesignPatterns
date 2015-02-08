package DriveSim.Decorator;

public class Alloys extends ModificationDecorator{
    CarModification modification;

    public Alloys(CarModification modification){
        this.modification = modification;
    }

    @Override
    public double getPrice() {
        return modification.getPrice() + 2500;
    }

    @Override
    public String toString() {
        return modification.toString() + "\nModification: Alloys";
    }
}