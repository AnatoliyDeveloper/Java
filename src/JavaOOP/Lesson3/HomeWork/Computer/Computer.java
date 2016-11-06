package JavaOOP.Lesson3.HomeWork.Computer;

import java.util.Random;

/**
 * Created by Anatoliy on 09.10.2016.
 */
public class Computer {

    private boolean turnOn;

    private Processor processor = new Processor("AMD", "FX-9590","Socket AM3+", 4.7, 8);
    private Ram ram = new Ram("Kingston", 16, "DDR3", "PC3-19200", 2400, 4);
    private Hdd hdd = new Hdd("Seagate", 2000, "SATA rev. 3.0", 3.5);
    private Drive drive = new Drive("LG", "Blu-ray", "SATA");

    public Processor getProcessor() {
        return processor;
    }

    public void setProcessor(Processor processor) {
        this.processor = processor;
    }

    public Ram getRam() {
        return ram;
    }

    public void setRam(Ram ram) {
        this.ram = ram;
    }

    public Hdd getHdd() {
        return hdd;
    }

    public void setHdd(Hdd hdd) {
        this.hdd = hdd;
    }

    public Drive getDrive() {
        return drive;
    }

    public void setDrive(Drive drive) {
        this.drive = drive;
    }

    public void setTurnOn(boolean turnOn) {
        this.turnOn = turnOn;
    }

    public void isTurnOn() {
        turnOn = true;
        System.out.println("Computer is turned ON");
    }

    public void isTurnOff() {
        turnOn = false;
        System.out.println("Computer is turned OFF");
    }

    public void checkViruses(){
        if (turnOn == true){
            Random random = new Random();
            boolean infected = random.nextBoolean();
            System.out.println("Your computer is infected? " + infected);
        } else {
            System.out.println("Virus scan is not possible, your computer is turned off");
        }
    }

    @Override
    public String toString() {
        return "Computer{" +
                "turnOn = " + turnOn +
                ", processor = " + processor +
                ", ram = " + ram +
                ", hdd = " + hdd +
                ", drive = " + drive +
                '}';
    }
}
