package Cars;

import CarFunctions.SteeetCleanig;
import Engine.Engine;

public class ServiceCar extends Car implements SteeetCleanig {
    public ServiceCar(String brand, String model, String color, String bodyType, int numberOfWheels, String transmissionType, Engine engine) {
        super(brand, model, color, bodyType, numberOfWheels, transmissionType, engine);
    }

    @Override
    public void streetCleaning() {
        System.out.println("Чистим улицу. "+ getEngine().workSound());
    }
}
