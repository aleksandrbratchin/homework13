package model.transport;

public abstract class WheeledTransport extends Transport {
    private final int wheelsCount;

    public WheeledTransport(String modelName, int wheelsCount) {
        super(modelName);
        this.wheelsCount = wheelsCount;
    }

    public int getWheelsCount() {
        return wheelsCount;
    }

    public void updateTyre(){
        System.out.println("Меняем покрышку");
    }
}
