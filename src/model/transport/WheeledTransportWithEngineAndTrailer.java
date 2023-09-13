package model.transport;

public abstract class WheeledTransportWithEngineAndTrailer extends WheeledTransportWithEngine implements Trailer{
    public WheeledTransportWithEngineAndTrailer(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }
}
