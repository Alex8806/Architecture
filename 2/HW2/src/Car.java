abstract class Car {
    Engine engine;

    public Car() {
        engine = createEngine();
    }

    abstract Engine createEngine();

    public void start() {
        System.out.println("Двигатель работает  " + engine.work());
        ;
    }
}
