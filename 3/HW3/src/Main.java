import Cars.*;
import Engine.*;

public class Main {
    public static void main(String[] args) {
        Engine e1 = new GasolineEngine(4);
        Truck t1 = new Truck("GAZ", "66", "Blue", "SingleCabin", 4, "Mech", e1, "Dump truck");
        t1.lightOn();
        t1.whipperOn();
        t1.cargoTransfer();
        t1.whipperOff();
        t1.lightOff();
        Engine e2 =new ElectricEngine(440);
        ServiceCar s1 = new ServiceCar("CityTruck","Chistylya","white","SingleCabin", 6, "Auto", e2 );
        s1.lightOn();
        s1.streetCleaning();
    }
}