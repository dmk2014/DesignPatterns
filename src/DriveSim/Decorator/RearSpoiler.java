package DriveSim.Decorator;

public class RearSpoiler extends ModificationDecorator {
    CarModification modification;

    public RearSpoiler(CarModification modification){
        this.modification = modification;
    }

    @Override
    public double getPrice() {
        return modification.getPrice() + 2000;
    }

    @Override
    public String toString() {
        return modification.toString() + "\nModification: Rear Spoiler";
    }
}