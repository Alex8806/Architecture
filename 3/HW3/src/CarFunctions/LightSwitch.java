package CarFunctions;

public interface LightSwitch {
    default void lightOn(){
        System.out.println("Фары горят.");
    }
    default void lightOff(){
        System.out.println("Фары не горят.");
    }
}
