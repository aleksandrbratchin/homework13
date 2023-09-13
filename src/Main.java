import model.transport.WheeledTransport;
import service.ServiceStation;
import model.transport.Bicycle;
import model.transport.Car;
import model.transport.Truck;

public class Main {
    public static void main(String[] args) {
        WheeledTransport car = new Car("car1", 4);
        WheeledTransport car2 = new Car("car2", 4);

        WheeledTransport truck = new Truck("truck1",6);
        WheeledTransport truck2 = new Truck("truck2",8);

        WheeledTransport bicycle = new Bicycle("bicycle1",2);
        WheeledTransport bicycle2 = new Bicycle("bicycle2",2);

        ServiceStation station = new ServiceStation();
        station.check(car);
        System.out.println();
        station.check(car2);
        System.out.println();
        station.check(bicycle);
        System.out.println();
        station.check(bicycle2);
        System.out.println();
        station.check(truck);
        System.out.println();
        station.check(truck2);

    }
}