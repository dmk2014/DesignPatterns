package DriveSim.Decorator;

public class ExpensiveModificationGarage extends CarModification{
    @Override
    public double getPrice() {
        return 9000;
    }

    @Override
    public String toString() {
        return "Modifications Package By: Expensive Modifiers";
    }
}