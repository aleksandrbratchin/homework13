package service;

import model.transport.*;

public class ServiceStationWheeledTransport {

    protected void welcomeMessage(String name) {
        System.out.println("Обслуживаем " + name);
        System.out.println();
    }

    protected void checkTyre(int wheel) {
        for (int i = 0; i < wheel; i++) {
            System.out.println("Меняем покрышку");
        }
    }

    protected void checkEngine() {
        System.out.println("Проверяем двигатель");
    }

    protected void checkTrailer() {
        System.out.println("Проверяем прицеп");
    }

    public void check(Car car) {
        welcomeMessage(car.getModelName());
        checkTyre(car.getWheelsCount());
        checkEngine();
    }

    public void check(Truck truck) {
        welcomeMessage(truck.getModelName());
        checkTyre(truck.getWheelsCount());
        checkEngine();
        checkTrailer();
    }

    public void check(Bicycle bicycle) {
        welcomeMessage(bicycle.getModelName());
        checkTyre(bicycle.getWheelsCount());
    }


}
