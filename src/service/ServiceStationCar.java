package service;

import model.transport.WheeledTransport;

public class ServiceStationCar extends ServiceStationBicycle {

    protected void checkEngine() {
        System.out.println("Проверяем двигатель");
    }

    @Override
    public void check(WheeledTransport car) {
        super.check(car);
        checkEngine();
    }

}
