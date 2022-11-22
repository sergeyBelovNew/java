package task1And2;

import java.util.Random;
import java.util.Scanner;

public class RightTriangle implements Area {

    RightTriangle() {
        Random random = new Random();
        leg1 =   random.nextDouble(100);
        leg2 =   random.nextDouble(100);
    }

    @Override
    public double calculateArea() {
        return leg1 * leg2 * 0.5;
    }

    public void inputLegs() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input leg1: ");
        leg1 = scanner.nextDouble();
        System.out.println("Input leg2 ");
        leg2 = scanner.nextDouble();
        hypotenuse = Math.sqrt(Math.pow(leg1, 2) + Math.pow(leg2, 2));
    }

    public void showInformationRightTriangle() {
        System.out.println("Leg1: " + leg1 + "\nLeg2: " + leg2 + "\nHypotenuse: " + hypotenuse + "\nArea: ");
        System.out.print(calculateArea() + "\n");
    }

    private double leg1;
    private double leg2;
    private double hypotenuse;

}

