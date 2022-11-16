package task1And2;

import task1And2.Area;

import java.util.Random;
import java.util.Scanner;

public class Square implements Area {

    Square() {
        Random random = new Random();
        side =   random.nextDouble(100);
    }

    @Override
    public void calculateArea() {
        area = side * side;
    }

    public void inputSide() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input side: ");
        side = scanner.nextDouble();
    }

    public void showInformationSquare() {
        System.out.println("Side: " + side + "\ntask1And2.Area: " + area);
    }

    public double getArea() {
        return area;
    }

    private double side;
    private double area;

}
