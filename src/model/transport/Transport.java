package model.transport;

public abstract class Transport {

    private final String modelName;

    public Transport(String modelName) {
        this.modelName = modelName;
    }

    public String getModelName() {
        return modelName;
    }
}
