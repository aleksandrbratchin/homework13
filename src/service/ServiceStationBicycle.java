package service;

import model.transport.Bicycle;
import model.transport.WheeledTransport;

public class ServiceStationBicycle extends ServiceStationWheeledTransport {
    @Override
    public void check(WheeledTransport wheeledTransport) {
        check((Bicycle) wheeledTransport);
    }

    public void check(Bicycle bicycle) {
        welcomeMessage(bicycle);
        checkTyre(bicycle.getWheelsCount());
    }

}
