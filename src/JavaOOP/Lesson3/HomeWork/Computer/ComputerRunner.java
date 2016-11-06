package JavaOOP.Lesson3.HomeWork.Computer;

/**
 * Created by Anatoliy on 10.10.2016.
 */
/*
Создать  объект  класса Компьютер,  используя  классы  Винчестер, Дисковод, Оперативная память, Процессор.
Методы: включить, выключить, проверить на вирусы, вывести на консоль размер винчестера.
 */
public class ComputerRunner {

    public static void main(String[] args) {

        Computer computer = new Computer();

        computer.isTurnOn();
        computer.isTurnOff();
        computer.isTurnOn();
        computer.checkViruses();

        System.out.println("HDD volume : " + computer.getHdd().getVolumeGb() + " GB");
    }
}
