package DriveSim.Adapter;

import DriveSim.Strategy.IEngineBehaviour;

public class ExperimentalEngineAdapter implements IEngineBehaviour{
    IExperimentalEngine engine;

    public ExperimentalEngineAdapter(IExperimentalEngine engine) {
        this.engine = engine;
    }

    @Override
    public void start() {
        engine.powerOn();
    }

    @Override
    public void stop() {
        engine.powerOff();
    }
}