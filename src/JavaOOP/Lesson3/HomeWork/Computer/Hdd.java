package JavaOOP.Lesson3.HomeWork.Computer;

/**
 * Created by Anatoliy on 09.10.2016.
 */
public class Hdd {

    private String nameManufacturer;
    private int volumeGb;
    private String connectionInterface;
    private double formFactorInch;

    public Hdd(String nameManufacturer, int volumeGb, String connectionInterface, double formFactorInch) {
        this.nameManufacturer = nameManufacturer;
        this.volumeGb = volumeGb;
        this.connectionInterface = connectionInterface;
        this.formFactorInch = formFactorInch;
    }

    public String getNameManufacturer() {
        return nameManufacturer;
    }

    public void setNameManufacturer(String nameManufacturer) {
        this.nameManufacturer = nameManufacturer;
    }

    public int getVolumeGb() {
        return volumeGb;
    }

    public void setVolumeGb(int volumeGb) {
        this.volumeGb = volumeGb;
    }

    public String getConnectionInterface() {
        return connectionInterface;
    }

    public void setConnectionInterface(String connectionInterface) {
        this.connectionInterface = connectionInterface;
    }

    public double getformFactorInch() {
        return formFactorInch;
    }

    public void setformFactorInch(double formFactor) {
        this.formFactorInch = formFactorInch;
    }

    @Override
    public String toString() {
        return "Hdd{" +
                "nameManufacturer='" + nameManufacturer + '\'' +
                ", volumeGb=" + volumeGb +
                ", connectionInterface='" + connectionInterface + '\'' +
                ", formFactorInch=" + formFactorInch +
                '}';
    }
}
