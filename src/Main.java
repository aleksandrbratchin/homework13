import model.transport.Bicycle;
import model.transport.Car;
import model.transport.Truck;
import service.ServiceStationWheeledTransport;

public class Main {
    public static void main(String[] args) {
        Car[] cars = new Car[]{
                new Car("car1", 4),
                new Car("car2", 4)
        };
        Truck[] trucks = new Truck[]{
                new Truck("truck1", 6),
                new Truck("truck2", 8)
        };

        Bicycle[] bicycles = new Bicycle[]{
                new Bicycle("bicycle1", 2),
                new Bicycle("bicycle2", 2)
        };


        ServiceStationWheeledTransport station = new ServiceStationWheeledTransport();
        station.check(cars);
        station.check(bicycles);
        station.check(trucks);
    }
}