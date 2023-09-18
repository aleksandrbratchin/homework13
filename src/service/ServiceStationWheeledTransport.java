package service;

import model.transport.WheeledTransport;

public abstract class ServiceStationWheeledTransport {

    public void check(WheeledTransport wheeledTransport) {
        System.out.println("Обслуживаем " + wheeledTransport.getModelName());
        System.out.println();
        checkTyre(wheeledTransport.getWheelsCount());
    }

    protected void checkTyre(int wheel) {
        for (int i = 0; i < wheel; i++) {
            System.out.println("Меняем покрышку");
        }
    }

}
