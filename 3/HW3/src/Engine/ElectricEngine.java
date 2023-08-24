package Engine;

public class ElectricEngine extends Engine implements ConsumeEnergyFromBattery{
private int Voltage;

    public ElectricEngine(int voltage) {
        Voltage = voltage;
    }

    public int getVoltage() {
        return Voltage;
    }

    public void setVoltage(int voltage) {
        Voltage = voltage;
    }

    @Override
    public String workSound() {
        return "Дз-дз-дз";
    }
}
