package Engine;

public class GasolineEngine extends Engine implements ConsumeTheFuel{
    private int volume;

    public GasolineEngine(int volume) {
        this.volume = volume;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    @Override
    public String workSound() {
        return "Др-др-др";
    }
}
