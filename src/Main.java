import model.transport.Bicycle;
import model.transport.Car;
import model.transport.Truck;
import model.transport.WheeledTransport;

public class Main {
    public static void main(String[] args) {
        WheeledTransport[] transports = new WheeledTransport[]{
                new Car("car1", 4),
                new Car("car2", 4),
                new Truck("truck1", 6),
                new Truck("truck2", 8),
                new Bicycle("bicycle1", 2),
                new Bicycle("bicycle2", 2)
        };
        for (WheeledTransport transport : transports) {
            transport.check();
            System.out.println();
        }
    }
}