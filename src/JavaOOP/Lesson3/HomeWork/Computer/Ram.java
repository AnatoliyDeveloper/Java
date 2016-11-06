package JavaOOP.Lesson3.HomeWork.Computer;

/**
 * Created by Anatoliy on 09.10.2016.
 */
public class Ram {

    private String nameManufacturer;
    private int volumeGb;
    private String typeDDR;
    private String standard;
    private int effectiveFrequencyMHz;
    private int numberStrips;

    public Ram(String nameManufacturer, int volumeGb, String typeDDR, String standard, int effectiveFrequencyMHz, int numberStrips) {
        this.nameManufacturer = nameManufacturer;
        this.volumeGb = volumeGb;
        this.typeDDR = typeDDR;
        this.standard = standard;
        this.effectiveFrequencyMHz = effectiveFrequencyMHz;
        this.numberStrips = numberStrips;
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

    public String getTypeDDR() {
        return typeDDR;
    }

    public void setTypeDDR(String typeDDR) {
        this.typeDDR = typeDDR;
    }

    public String getStandard() {
        return standard;
    }

    public void setStandard(String standard) {
        this.standard = standard;
    }

    public int getEffectiveFrequencyMHz() {
        return effectiveFrequencyMHz;
    }

    public void setEffectiveFrequencyMHz(int effectiveFrequencyMHz) {
        this.effectiveFrequencyMHz = effectiveFrequencyMHz;
    }

    public int getNumberStrips() {
        return numberStrips;
    }

    public void setNumberStrips(int numberStrips) {
        this.numberStrips = numberStrips;
    }

    @Override
    public String toString() {
        return "Ram{" +
                "nameManufacturer='" + nameManufacturer + '\'' +
                ", volumeGb=" + volumeGb +
                ", typeDDR='" + typeDDR + '\'' +
                ", standard='" + standard + '\'' +
                ", effectiveFrequencyMHz=" + effectiveFrequencyMHz +
                ", numberStrips=" + numberStrips +
                '}';
    }
}
