import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        executeTask1();
        executeTask2();
        executeTask3();
        executeTask4();
        executeTask5();
    }

    //6.1. Сумма квадратов чисел.
    public static void executeTask1() {
        var scannerInt = new Scanner(System.in);
        int numForSquare1, numForSquare2, sumSquare;
        System.out.println("Введите число: ");
        numForSquare1 = scannerInt.nextInt();
        System.out.println("Введите число: ");
        numForSquare2 = scannerInt.nextInt();
        numForSquare1 = (int) squaring(numForSquare1);
        numForSquare2 = (int) squaring(numForSquare2);
        sumSquare = numForSquare1 + numForSquare2;
        System.out.println("Число сумма чисел в квадрате: " + sumSquare);
    }

    //6.2. Возведение чисел в степень.
    public static void executeTask2() {
        var scannerInt = new Scanner(System.in);
        int numForDegree;
        int degree;
        System.out.println("Введите число: ");
        numForDegree = scannerInt.nextInt();
        degree = scannerInt.nextInt();
        numForDegree = (int) exponentiation(numForDegree, degree);
        System.out.println("Число возведенное в степень: " + numForDegree);
    }

    //6.3. Проверка четности чисел.
    public static void executeTask3() {
        var scannerInt = new Scanner(System.in);
        int numParityCheck;
        System.out.println("Введите число: ");
        numParityCheck = scannerInt.nextInt();
        boolean parity;
        parity = checkParity(numParityCheck);
        System.out.println("Число четное: " + parity);
    }

    //6.4. Удаление нечетных чисел из массива.
    public static void executeTask4() {
        int[] arrayWithNegativeNum = new int[34];
        fillIntArrayRandom(arrayWithNegativeNum);
        System.out.println("Массив с отрицательными элкментами: " + Arrays.toString(arrayWithNegativeNum));
        int[] arrayPositive = formationPositiveArray(arrayWithNegativeNum);
        System.out.println("Массив без отрицательных эл-ов: " + Arrays.toString(arrayPositive));
    }

    //6.5. Удаление числа из массива.
    public static void executeTask5() {
        int[] arrayRepeats = {2, 2, 3, 3, 1};
        int[] arrayWithoutRepeat = formationWithoutRepeatArray(arrayRepeats);
        System.out.println("Массив без повторов: " + Arrays.toString(arrayWithoutRepeat));
    }

    public static double squaring(int numForSquare) {
        return Math.pow(numForSquare, 2);
    }

    public static double exponentiation(int numForDegree, int degree) {
        return Math.pow(numForDegree, degree);
    }

    public static boolean checkParity(int num) {
        return num % 2 != 1;
    }

    public static void fillIntArrayRandom(int[] array) {
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = -40 + random.nextInt(100);
        }
    }

    public static int[] formationPositiveArray(int[] arrayWithNegativeNum) {
        int[] arrayPositive = Arrays.stream(arrayWithNegativeNum).filter(x -> x > 0).toArray();
        return arrayPositive;
    }

    public static int[] formationWithoutRepeatArray(int[] arrayWithRepeat) {
        int[] arrayWithoutRepeat = Arrays.stream(arrayWithRepeat).distinct().toArray();
        return arrayWithoutRepeat;
    }
}