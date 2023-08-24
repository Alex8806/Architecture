package Cars;

import CarFunctions.LightSwitch;
import CarFunctions.WhipperSwitch;
import Engine.Engine;

public abstract class Car implements LightSwitch, WhipperSwitch {
    private String brand;
    private String model;
    private String color;
    private String bodyType;
    private int numberOfWheels;
    private String transmissionType;

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    private Engine engine;

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getBodyType() {
        return bodyType;
    }

    public void setBodyType(String bodyType) {
        this.bodyType = bodyType;
    }

    public int getNumberOfWheels() {
        return numberOfWheels;
    }

    public void setNumberOfWheels(int numberOfWheels) {
        this.numberOfWheels = numberOfWheels;
    }

    public String getTransmissionType() {
        return transmissionType;
    }

    public void setTransmissionType(String transmissionType) {
        this.transmissionType = transmissionType;
    }





    protected Car(String brand, String model, String color, String bodyType, int numberOfWheels, String transmissionType,  Engine engine) {
        this.brand = brand;
        this.model = model;
        this.color = color;
        this.bodyType = bodyType;
        this.numberOfWheels = numberOfWheels;
        this.transmissionType = transmissionType;
        this.engine = engine;
    }
}
