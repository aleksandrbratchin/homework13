package service;

import model.transport.*;

public class ServiceStation {
    public void check(WheeledTransport wheeledTransport) {
        System.out.println("Обслуживаем " + wheeledTransport.getModelName());
        System.out.println();
        if(wheeledTransport instanceof Engine engine){
            engine.checkEngine();
        }
        if(wheeledTransport instanceof Trailer trailer){
            trailer.checkTrailer();
        }
        if(wheeledTransport instanceof Tyre tyre){
            for (int i = 0; i < wheeledTransport.getWheelsCount(); i++) {
                tyre.updateTyre();
            }
        }
    }
}
