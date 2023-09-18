package service;

import model.transport.WheeledTransport;

public class ServiceStationTrailer extends ServiceStationCar {

    private void checkTrailer() {
        System.out.println("Проверяем прицеп");
    }

    @Override
    public void check(WheeledTransport truck) {
        super.check(truck);
        checkTrailer();
    }
}
