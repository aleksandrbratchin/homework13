package model.transport;

public abstract class WheeledTransportWithEngineAndTrailer extends WheeledTransportWithEngine{
    public WheeledTransportWithEngineAndTrailer(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }
    public void checkTrailer() {
        System.out.println("Проверяем прицеп");
    }
}
