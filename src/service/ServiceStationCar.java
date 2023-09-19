package service;

import model.transport.Car;
import model.transport.WheeledTransport;

public class ServiceStationCar extends ServiceStationBicycle {
    @Override
    public void check(WheeledTransport wheeledTransport) {
        check((Car) wheeledTransport);
    }

    protected void checkEngine() {
        System.out.println("Проверяем двигатель");
    }

    public void check(Car car) {
        welcomeMessage(car);
        checkTyre(car.getWheelsCount());
        checkEngine();
    }

}
