package service;

import model.transport.*;

public class ServiceStationWheeledTransport {

    public void check(WheeledTransport transport) {
        welcomeMessage(transport);
        checkTyre(transport);
    }

    public void check(WheeledTransport[] transport) {
        for (WheeledTransport wheeledTransport : transport) {
            check(wheeledTransport);
            System.out.println();
        }
    }
    public void check(WheeledTransportWithEngine transport) {
        welcomeMessage(transport);
        transport.checkEngine();
        checkTyre(transport);
    }

    public void check(WheeledTransportWithEngine[] transport) {
        for (WheeledTransportWithEngine wheeledTransportWithEngine : transport) {
            check(wheeledTransportWithEngine);
            System.out.println();
        }
    }

    public void check(WheeledTransportWithEngineAndTrailer transport) {
        welcomeMessage(transport);
        transport.checkEngine();
        transport.checkTrailer();
        checkTyre(transport);
    }

    public void check(WheeledTransportWithEngineAndTrailer[] transport) {
        for (WheeledTransportWithEngineAndTrailer wheeledTransportWithEngineAndTrailer : transport) {
            check(wheeledTransportWithEngineAndTrailer);
            System.out.println();
        }
    }

    private void welcomeMessage(WheeledTransport transport) {
        System.out.println("Обслуживаем " + transport.getModelName());
        System.out.println();
    }
    private void checkTyre(WheeledTransport transport) {
        for (int i = 0; i < transport.getWheelsCount(); i++) {
            transport.updateTyre();
        }
    }

}
