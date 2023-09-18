package model.transport;

public abstract class WheeledTransportWithEngine extends WheeledTransport{
    public WheeledTransportWithEngine(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }

    public void checkEngine() {
        System.out.println("Проверяем двигатель");
    }
}
