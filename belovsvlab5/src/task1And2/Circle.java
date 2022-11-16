package task1And2;

import java.util.Random;
import java.util.Scanner;

public class Circle implements Area {

    Circle() {
        Random random = new Random();
        radius =   random.nextDouble(100);
    }

    @Override
    public void calculateArea() {
        area =  Math.pow(radius, 2) * Math.PI;
    }

    public void showInformationCircle() {
        System.out.println("Radius: " + radius + "\ntask1And2.Area: " + area);
    }

    public void inputRadius() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input radius: ");
        radius = scanner.nextDouble();
    }

    public double getArea() {
        return area;
    }

    private double radius;
    private double area;

}
