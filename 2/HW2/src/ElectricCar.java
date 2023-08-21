public class ElectricCar extends Car {
    @Override
    Engine createEngine() {
        System.out.println("Электродвигатель создан");
        return new ElectricEngine();
    }
}
