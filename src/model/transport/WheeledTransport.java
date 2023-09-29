package model.transport;

public abstract class WheeledTransport implements Checkable {

    private final String modelName;
    private final int wheelsCount;

    public WheeledTransport(String modelName, int wheelsCount) {
        this.modelName = modelName;
        this.wheelsCount = wheelsCount;
    }

    public int getWheelsCount() {
        return wheelsCount;
    }

    public String getModelName() {
        return modelName;
    }

    private void welcomeMessage(){
        System.out.println("Обслуживаем " + modelName);
        System.out.println();
    }

    private void checkTyre(int wheel) {
        for (int i = 0; i < wheel; i++) {
            System.out.println("Меняем покрышку");
        }
    }

    public void check() {
        welcomeMessage();
        checkTyre(wheelsCount);
    }

}
