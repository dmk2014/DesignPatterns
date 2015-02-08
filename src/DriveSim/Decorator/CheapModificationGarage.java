package DriveSim.Decorator;

public class CheapModificationGarage extends CarModification {
    @Override
    public double getPrice() {
        return 2500;
    }

    @Override
    public String toString() {
        return "Modifications Package By: Cheap Modifiers";
    }
}