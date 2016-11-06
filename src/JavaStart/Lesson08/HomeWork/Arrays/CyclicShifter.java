package JavaStart.Lesson08.HomeWork.Arrays;

/**
 * Created by Anatoliy on 25.09.2016.
 */
/*
Ќаписать метод циклического сдвига массива на shiftPositions.
≈сли shiftPositions - положительное, сдвиг вправо, иначе влево.
void cyclicShift(int[] array, int shiftPositions)
 */
public class CyclicShifter {

    public static void main(String[] args) {
        //Input
        int shifter = (int) (Math.random() * 20 - 10);
        ShiftingArray myShiftingArray = new ShiftingArray((int) (Math.random() * 15 + 5));
        myShiftingArray.fillArray();

        //Business Logic
        myShiftingArray.cyclicShift(shifter);

        //Output
        System.out.println("Array length: " + myShiftingArray.length());
        System.out.println("Shifter: " + shifter);
        System.out.println("\nOriginal array");
        myShiftingArray.printBackup();
        System.out.println("\nShifted array:");
        myShiftingArray.printArray();
    }
}

class ShiftingArray {
    private int sArray[];
    private int backupArray[];

    ShiftingArray(int arrayLength) {
        sArray = new int[arrayLength];
        backupArray = new int[arrayLength];
    }

    ShiftingArray() {
    }

    protected void cyclicShift(int shiftPositions) {
        backup();
        if (shiftPositions != 0) {
            int tempIndex;
            int tempArray[] = new int[sArray.length];
            for (int i = 0; i < sArray.length; i++) {
                tempIndex = shiftPositions < 0 ? Math.abs(i + shiftPositions + sArray.length) % sArray.length : (i + shiftPositions) % sArray.length;
                //System.out.println(tempIndex);
                tempArray[tempIndex] = sArray[i];
            }
            sArray = tempArray;
        }
    }

    protected void fillArray() {
        for (int i = 0; i < sArray.length; i++) {
            sArray[i] = (int) (Math.random() * 10);
        }
    }

    protected void printArray() {
        System.out.print("[");
        for (int i = 0; i < sArray.length; i++) {
            System.out.print(sArray[i]);
            if (i + 1 < sArray.length) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }

    protected void printBackup() {
        System.out.print("[");
        for (int i = 0; i < backupArray.length; i++) {
            System.out.print(backupArray[i]);
            if (i + 1 < backupArray.length) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }

    protected int length() {
        return sArray.length;
    }

    protected void backup() {
        for (int i = 0; i < sArray.length; i++) {
            backupArray[i] = sArray[i];
        }
    }
}
