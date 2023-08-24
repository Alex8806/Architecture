package Cars;

import CarFunctions.CargoTransfer;
import Engine.Engine;

public class Truck extends Car implements CargoTransfer {
    public Truck(String brand, String model, String color, String bodyType, int numberOfWheels, String transmissionType, Engine engine, String truckType) {
        super(brand, model, color, bodyType, numberOfWheels, transmissionType, engine);
        this.truckType = truckType;
    }

    public String getTruckType() {
        return truckType;
    }

    public void setTruckType(String truckType) {
        this.truckType = truckType;
    }

    private String truckType;



    @Override
    public void cargoTransfer() {
        System.out.println("Везём Груз. " + getEngine().workSound());
    }
}
