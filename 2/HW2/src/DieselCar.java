public class DieselCar extends Car {

    @Override
    Engine createEngine() {
        System.out.println("Дизель создан");
        return new DieselEngine();
    }
}
