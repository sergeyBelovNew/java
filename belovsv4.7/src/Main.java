import java.awt.*;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;
import java.util.stream.Stream;

public class Main {
    static final Scanner scannerStreamInt = new Scanner(System.in);
    static final Scanner scannerStreamStr = new Scanner(System.in);

    public static void main(String[] args) {
        //7.1 Калькулятор
        SimpleGUI.Frame test = new SimpleGUI.Frame();
        test.createMenu();
        System.out.println("7.1 Калькулятор");
        executeTask1();
        //7.2 Массив изменяемой длинны
        System.out.println("7.2 Массив изменяемой длинны");
        executeTask2();
        scannerStreamInt.close();
    }

    public static void executeTask1() {
        int choose;
        System.out.println("Введите 1-ое число:");
        firstNumber = scannerStreamInt.nextInt();
        System.out.println("Введите 2-ое число:");
        secondNumber = scannerStreamInt.nextInt();
        showMenu();
        choose = scannerStreamInt.nextInt();
        runCalculator(choose);
    }

    public static void executeTask2() {
        int[] array = new int[10];
        int[] newArray = fillArray();
        if (newArray.length <= 10)
            array = Arrays.copyOfRange(newArray, 0, newArray.length);
        else
            array = Arrays.copyOf(newArray, newArray.length);
        System.out.println(Arrays.toString(array));
    }

    public static int[] fillArray() {
        System.out.println("Введите максимальный размер массива:");
        int maxSize = scannerStreamInt.nextInt();
        int[] arrayOut = new int[maxSize];
        String breakCycle = "";
        for (int i = 0; i < maxSize; i++) {
            arrayOut[i] = scannerStreamInt.nextInt();
            System.out.println("Прервать ввод(введите End, иначе любой символ)");
            breakCycle = scannerStreamStr.nextLine();
            if (breakCycle.equals("End"))
                return arrayOut;
        }
        return arrayOut;
    }
/* Не работает конвертация Object[] в Integer[]
    public static int[] fillArrayMap() {
        HashMap<Integer, String> hashMap = new HashMap<>();
        String breakEnd = "";
        while (!breakEnd.equals("End")) {
            System.out.println("Введите значение массива: ");
            System.out.println("Прервать ввод(введите End, иначе любой символ)");
            hashMap.put(scannerStreamInt.nextInt(), breakEnd = scannerStreamStr.nextLine());
        }
        Object[] tempObj = Arrays.copyOf(hashMap.values().toArray(), hashMap.size());
        //Ошибка
        Integer[]tempInteger =(Integer[]) Arrays.stream(tempObj).toArray(Integer[]:: new);
        return convertIntegerToInt(tempInteger);
    }

    //Есть ли метод для конвертации?
    public static int[] convertIntegerToInt(Integer[] source) {
        int[] out = new int[source.length];
        for (int i = 0; i < source.length; i++)
            out[i] = source[i];
        return out;
    }
*/
    public static void runCalculator(int chooseOption) {
        Scanner scannerInt = new Scanner(System.in);
        while (chooseOption != 6) {
            switch (chooseOption) {
                case 1:
                    System.out.println("Сумма: ");
                    add(firstNumber, secondNumber);
                    break;
                case 2:
                    System.out.println("Разность: ");
                    subtract(firstNumber, secondNumber);
                    break;
                case 3:
                    System.out.println("Произведение: ");
                    multiply(firstNumber, secondNumber);
                    break;
                case 4:
                    System.out.println("Деление: ");
                    divide(firstNumber, secondNumber);
                    break;
                case 5:
                    System.out.println("Возведение в степень: ");
                    exponentiation(firstNumber, secondNumber);
                    break;
                default:
                    break;
            }
            if (chooseOption != 6)
                chooseOption = scannerInt.nextInt();
        }
    }

    public static void add(int num1, int num2) {
        System.out.println(num1 + num2);
    }


    public static void subtract(int num1, int num2) {
        System.out.println(num1 - num2);
    }

    //
    public static void multiply(int num1, int num2) {
        System.out.println(num1 * num2);
    }

    public static void divide(int num1, int num2) {
        if (num2 != 0)
            System.out.println(num1 / num2);
        else System.out.println("Деление на ноль");
    }

    public static void exponentiation(int num1, int degree) {
        if (degree >= 0)
            System.out.println(Math.pow(num1, degree));
        else System.out.println("Значение степени должно быть положительным");
    }

    public static void showMenu() {
        System.out.println("Чтобы выбрать операцию введите число:\n1 - сумма\n2 - разность\n3 - произведение\n4 - деленеи\n5 - возведение в степень\n6 - выход");
    }

    private static int firstNumber, secondNumber;

}