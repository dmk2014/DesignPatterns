package DriveSim.Vehicles;

import DriveSim.Composite.GameComponent;
import DriveSim.Composite.GameItemComposite;
import DriveSim.Decorator.CarModification;
import DriveSim.State.AccelerationState;
import DriveSim.State.OffState;
import DriveSim.State.OnState;
import DriveSim.State.State;
import DriveSim.Strategy.*;
import java.awt.*;

public abstract class Car extends GameComponent{
    private String manufacturer;
    private String model;
    private Color color;
    private double price;

    //Decorator
    private CarModification modifications;

    //Strategy
    ITransmissionBehaviour transmission;
    IEngineBehaviour engine;

    //State
    State onState;
    State offState;
    State accelerationState;
    State state;

    public Car(){
        this.transmission = new ManualTransmission();
        this.engine = new StandardEngine();

        this.onState = new OnState(this);
        this.offState = new OffState(this);
        this.accelerationState = new AccelerationState(this);
        this.state = offState;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color){
        this.color = color;
    }

    public double getPrice(){
        if(modifications != null)
            return price + modifications.getPrice();
        else
            return price;
    }

    public void setPrice(double price){
        this.price = price;
    }

    public CarModification getModifications(){
        return this.modifications;
    }

    public void setModifications(CarModification modifications) {
        this.modifications = modifications;
    }

    public ITransmissionBehaviour getTransmission(){
        return transmission;
    }

    public void setTransmission(ITransmissionBehaviour transmission){
        System.out.println("Changing " + model + " transmission type to: " + transmission.getClass().getSimpleName());
        this.transmission = transmission;
    }

    public IEngineBehaviour getEngine(){
        return engine;
    }

    public void setEngine(IEngineBehaviour engine){
        System.out.println("Changing " + model + " engine type to: " + engine.getClass().getSimpleName());
        this.engine = engine;
    }

    public State getOnState(){
        return onState;
    }

    public State getOffState(){
        return offState;
    }

    public State getAccelerationState(){
        return accelerationState;
    }

    public void setState(State state){
        this.state = state;
    }

    public void gearUp(){
        transmission.gearShiftUp();
    }

    public void gearDown(){
        transmission.gearShiftDown();
    }

    public void startEngine(){
        state.turnKeyToStart();
    }

    public void stopEngine(){
        state.turnKeyToStop();
    }

    public void accelerate(){
        state.accelerate();
    }

    public void brake(){
        state.brake();
    }

    public void print(){
        String modifications;

        if(this.modifications != null){
            modifications = getModifications().toString();
        }
        else{
            modifications = "No Modifications Installed";
        }

        System.out.println("Manufacturer: " + getManufacturer() +
                        "\nModel: " + getModel() +
                        "\nColour: " + getColor().toString() +
                        "\n" + modifications +
                        "\nPrice: €" + String.format("%.2f", getPrice()) +
                        "\n"
        );
    }
}