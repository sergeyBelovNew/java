import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //7.1 Калькулятор
        executeTask1();
        //7.2 Массив изменяемой длинны
        executeTask2();
    }

    public static void executeTask1() {
        int choose;
        Scanner scannerInt = new Scanner(System.in);
        firstNumber = scannerInt.nextInt();
        secondNumber = scannerInt.nextInt();
        showMenu();
        choose = scannerInt.nextInt();
        runCalculator(choose);
        scannerInt.close();
    }

    public static void executeTask2() {
        Scanner scannerInt = new Scanner(System.in);
        int[] array = new int[10];
        if (fillArray().length <= 10)
            array = Arrays.copyOfRange(fillArray(), 0, fillArray().length - 1);
        else
            array = Arrays.copyOf(fillArray(), fillArray().length);
        Arrays.toString(array);
        scannerInt.close();

    }

    public static int[] fillArray() {
        Scanner scannerInt = new Scanner(System.in);
        Scanner scannerStr = new Scanner(System.in);
        int[] arrayOut;
        String breakCycle = "";
        while (breakCycle != "End") {
            arrayOut[] = scannerInt.nextInt();
            breakCycle = scannerStr.nextLine();
        }
        scannerInt.close();
        scannerStr.close();
        return arrayOut;
    }

    public static void runCalculator(int chooseOption) {
        Scanner scannerInt = new Scanner(System.in);
        while (chooseOption != 6) {
            switch (chooseOption) {
                case 1:
                    System.out.println("Сумма: ");
                    add(firstNumber, secondNumber);
                case 2:
                    System.out.println("Произведение: ");
                    subtract(firstNumber, secondNumber);
                case 3:
                    System.out.println("Произведение: ");
                    multiply(firstNumber, secondNumber);
                case 4:
                    System.out.println("Разность: ");
                    divide(firstNumber, secondNumber);
                case 5:
                    System.out.println("Возведение в степень: ");
                    exponentiation(firstNumber, secondNumber);
                default:
                    break;
            }
            chooseOption = scannerInt.nextInt();
            scannerInt.close();
        }
    }

    public static void add(int num1, int num2) {
        System.out.print(num1 + num2);
    }


    public static void subtract(int num1, int num2) {
        System.out.print(num1 - num2);
    }
//
    public static void multiply(int num1, int num2) {
        System.out.print(num1 * num2);
    }

    public static void divide(int num1, int num2) {
        if (num2 != 0)
            System.out.print(num1 / num2);
        else System.out.print("Деление на ноль");
    }

    public static void exponentiation(int num1, int degree) {
        if (degree >= 0)
            System.out.print(Math.pow(num1, degree));
        else System.out.print("Значение степени должно быть положительным");
    }

    public static void showMenu() {
        System.out.println("Чтобы выбрать операцию введите число:\n1 - сумма\n2 - разность\n3 - произведение\n4 - деленеи\n5 - возведение в степень");
    }

    private static int firstNumber, secondNumber;

}