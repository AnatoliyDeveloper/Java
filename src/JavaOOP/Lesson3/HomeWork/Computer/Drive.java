package JavaOOP.Lesson3.HomeWork.Computer;

/**
 * Created by Anatoliy on 09.10.2016.
 */
public class Drive {

    private String nameManufacturer;
    private String typeDrive;
    private String connectionInterface;

    public Drive(String nameManufacturer, String typeDrive, String connectionInterface) {
        this.nameManufacturer = nameManufacturer;
        this.typeDrive = typeDrive;
        this.connectionInterface = connectionInterface;
    }

    public String getNameManufacturer() {
        return nameManufacturer;
    }

    public void setNameManufacturer(String nameManufacturer) {
        this.nameManufacturer = nameManufacturer;
    }

    public String getTypeDrive() {
        return typeDrive;
    }

    public void setTypeDrive(String typeDrive) {
        this.typeDrive = typeDrive;
    }

    public String getConnectionInterface() {
        return connectionInterface;
    }

    public void setConnectionInterface(String connectionInterface) {
        this.connectionInterface = connectionInterface;
    }

    @Override
    public String toString() {
        return "Drive{" +
                "nameManufacturer='" + nameManufacturer + '\'' +
                ", typeDrive='" + typeDrive + '\'' +
                ", connectionInterface='" + connectionInterface + '\'' +
                '}';
    }
}
