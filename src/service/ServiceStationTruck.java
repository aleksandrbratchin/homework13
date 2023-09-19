package service;

import model.transport.Truck;
import model.transport.WheeledTransport;

public class ServiceStationTruck extends ServiceStationCar {
    @Override
    public void check(WheeledTransport wheeledTransport) {
        check((Truck) wheeledTransport);
    }

    protected void checkTrailer() {
        System.out.println("Проверяем прицеп");
    }

    public void check(Truck truck) {
        welcomeMessage(truck);
        checkTyre(truck.getWheelsCount());
        checkEngine();
        checkTrailer();
    }
}
