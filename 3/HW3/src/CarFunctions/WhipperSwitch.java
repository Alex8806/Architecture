package CarFunctions;

public interface WhipperSwitch {
    default void whipperOn(){
        System.out.println("Дворники работают");
    }
    default void whipperOff(){
        System.out.println("Дворники не работают");
    }
}
