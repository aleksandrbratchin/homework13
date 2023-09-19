package service;

import model.transport.WheeledTransport;

public abstract class ServiceStationWheeledTransport {

    public void check(WheeledTransport wheeledTransport) {
        welcomeMessage(wheeledTransport);
        checkTyre(wheeledTransport.getWheelsCount());
    }

    protected void welcomeMessage(WheeledTransport wheeledTransport){
        System.out.println("Обслуживаем " + wheeledTransport.getModelName());
        System.out.println();
    }

    protected void checkTyre(int wheel) {
        for (int i = 0; i < wheel; i++) {
            System.out.println("Меняем покрышку");
        }
    }

}
