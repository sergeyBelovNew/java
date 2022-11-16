
import javax.swing.*;
import javax.swing.plaf.basic.DefaultMenuLayout;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Arrays;
import java.util.Scanner;

public class RightTriangle {
    public RightTriangle() {
        cathet1 = 3;
        cathet2 = 4;
        hypotenuse = 5;
    }

    public RightTriangle(double cathet1, double cathet2) {
        this.cathet1 = cathet1;
        this.cathet2 = cathet2;
        this.hypotenuse = Math.sqrt(Math.pow(cathet1, 2) + Math.pow(cathet2, 2));
    }
    public static void main(String[] args) {
        //
        System.out.println("Треугольник:");
        RightTriangle triangle = new RightTriangle(6.0,8.0);
        triangle.formationTriangle();
        triangle.showTriangle();

    }
    public double getCathet1() {
        return cathet1;
    }

    public void setCathet1(double cathet1) {
        this.cathet1 = cathet1;
    }

    public double getCathet2() {
        return cathet2;
    }

    public void setCathet2(double cathet2) {
        this.cathet2 = cathet2;
    }

    public double getHypotenuse() {
        return hypotenuse;
    }

    public void setHypotenuse(double hypotenuse) {
        this.hypotenuse = hypotenuse;
    }

    public void formationTriangle() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите катет 1:");
        cathet1 = scan.nextDouble();
        System.out.println("Введите катет 2:");
        cathet2 = scan.nextDouble();
        this.hypotenuse = Math.sqrt(Math.pow(cathet1, 2) + Math.pow(cathet2, 2));
    }

    public void showTriangle() {
        System.out.println("Катет 1: " + cathet1);
        System.out.println("Катет 2: " + cathet2);
        System.out.println("Гипотенуза: " + hypotenuse);
    }

    private double cathet1;
    private double cathet2;
    private double hypotenuse;
}

