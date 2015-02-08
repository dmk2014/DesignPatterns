package DriveSim.Observer;

public class GenericGameMapDisplay implements IObserver {
    private int carCount;
    private int driverCount;
    private ISubject subject;

    public GenericGameMapDisplay(ISubject subject){
        this.subject = subject;
        subject.registerObserver(this); //Register "this" class as an observer
    }

    @Override
    public void update(int carCount, int playerCount) {
        this.carCount = carCount;
        this.driverCount = playerCount;
        this.showMapDetails();
    }

    public void showMapDetails(){
        System.out.println("The Game Map currently consists of:" +
            "\n\tCars: " + carCount +
            "\n\tDrivers: " + driverCount +
            "\n");
    }
}