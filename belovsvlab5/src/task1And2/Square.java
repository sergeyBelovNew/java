package task1And2;

import java.util.Random;
import java.util.Scanner;

public class Square implements Area {

    Square() {
        Random random = new Random();
        side =   random.nextDouble(100);
    }

    @Override
    public double calculateArea() {
        return  side * side;
    }

    public void inputSide() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input side: ");
        side = scanner.nextDouble();
    }

    public void showInformationSquare() {
        System.out.println("Side: " + side + "\ntask1And2.Area: " );
        System.out.println(calculateArea() + "\n");
    }

    private double side;

}
