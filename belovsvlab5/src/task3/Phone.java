package task3;

import java.util.Scanner;

public class Phone {

    public Phone(String number, String model, int weight) {
        this(number, model);
        this.weight = weight;
    }

    public Phone(String number, String model) {
        this.number = number;
        this.model = model;
    }

    public Phone() {
        this.model = "Next generation phone";
        this.number = "7 980 234 35 45";
        this.weight = 100;
    }

    public void sendMessage(Phone[] phones) {
        Phone phone = new Phone();
        for (int i = 0; i < phones.length; i++) {
            phone = phones[i];
            System.out.println(phone.number);
        }
    }

    public void receiveCall(String name) {
        System.out.println("Calling{" + name + "}");
    }

    public void receiveCall(String name, String number) {
        System.out.println("Calling{" + name + "}");
        System.out.println("Calling{" + number + "}");
    }

    public String getNumber() {
        return number;
    }

    public void showInfo() {
        System.out.println("Number: " + number + "  Model: " + model + "  Weight: " + weight);
    }

    public void inputAll() {
        inputNumber();
        inputModel();
        inputWeight();
    }

    public void inputNumber() {
        System.out.println("Number:");
        number = scannerString.nextLine();
    }

    public void inputModel() {
        System.out.println("Model:");
        model = scannerString.nextLine();
    }

    public void inputWeight() {
        System.out.println("Weight:");
        weight = scannerInt.nextInt();
    }

    private static final Scanner scannerString = new Scanner(System.in);
    private static final Scanner scannerInt = new Scanner(System.in);
    private String number;
    private String model;
    private int weight;

}
