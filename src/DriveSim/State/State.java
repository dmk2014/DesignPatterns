package DriveSim.State;

public interface State {
    void turnKeyToStart();
    void accelerate();
    void brake();
    void turnKeyToStop();
}