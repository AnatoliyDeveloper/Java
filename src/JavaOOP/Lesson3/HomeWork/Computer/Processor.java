package JavaOOP.Lesson3.HomeWork.Computer;

/**
 * Created by Anatoliy on 09.10.2016.
 */
public class Processor {

    private String nameManufacturer;
    private String processorModel;
    private String connectorType;
    private double clockSpeedGHz;
    private int numberCores;

    public Processor(String nameManufacturer, String processorModel, String connectorType, double clockSpeedGHz, int numberCores) {
        this.nameManufacturer = nameManufacturer;
        this.processorModel = processorModel;
        this.connectorType = connectorType;
        this.clockSpeedGHz = clockSpeedGHz;
        this.numberCores = numberCores;
    }

    public String getNameManufacturer() {
        return nameManufacturer;
    }

    public void setNameManufacturer(String nameManufacturer) {
        this.nameManufacturer = nameManufacturer;
    }

    public String getProcessorModel() {
        return processorModel;
    }

    public void setProcessorModel(String processorModel) {
        this.processorModel = processorModel;
    }

    public String getConnectorType() {
        return connectorType;
    }

    public void setConnectorType(String connectorType) {
        this.connectorType = connectorType;
    }

    public double getClockSpeedGHz() {
        return clockSpeedGHz;
    }

    public void setClockSpeedGHz(double clockSpeedGHz) {
        this.clockSpeedGHz = clockSpeedGHz;
    }

    public int getNumberCores() {
        return numberCores;
    }

    public void setNumberCores(int numberCores) {
        this.numberCores = numberCores;
    }

    @Override
    public String toString() {
        return "Processor{" +
                "nameManufacturer='" + nameManufacturer + '\'' +
                ", processorModel='" + processorModel + '\'' +
                ", connectorType='" + connectorType + '\'' +
                ", clockSpeedGHz=" + clockSpeedGHz +
                ", numberCores=" + numberCores +
                '}';
    }
}
