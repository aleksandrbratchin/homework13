package model.transport;

public abstract class WheeledTransportWithEngine extends WheeledTransport implements Engine{
    public WheeledTransportWithEngine(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }
}
