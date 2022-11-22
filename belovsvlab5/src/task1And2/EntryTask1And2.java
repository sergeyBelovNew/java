package task1And2;

import java.util.Scanner;

public class EntryTask1And2  {

    public void runEntry(){
            while (chooseFigure != 5) {
                System.out.println("Choose next figure");
                chooseFigure = scannerInt.nextInt();
                switch (chooseFigure) {
                    case 1 -> executeCaseRightTriangle();
                    case 2 -> executeCaseSquare();
                    case 3 -> executeCaseCircle();
                    case 4 -> runSeveralFigure();
                    default -> {
                    }
                }
            }
            scannerInt.close();
        }

    private void executeCaseRightTriangle() {
        rightTriangle.inputLegs();
        rightTriangle.calculateArea();
        rightTriangle.showInformationRightTriangle();
    }

    private void executeCaseSquare() {
        square.inputSide();
        square.calculateArea();
        square.showInformationSquare();
    }

    private void executeCaseCircle() {
        circle.inputRadius();
        circle.calculateArea();
        circle.showInformationCircle();
    }

    //need fix 11
    private void runSeveralFigure() {
        System.out.println("Input number of right triangles, that you want: ");
        numberTriangles = scannerInt.nextInt();
        System.out.println("Input number of squares, that you want: ");
        numberSquare = scannerInt.nextInt();
        numberSquare += numberTriangles;
        System.out.println("Input number of circles, that you want: ");
        numberCircle = scannerInt.nextInt();
        numberCircle += numberSquare;
        fillFiguresArray();
    }

    private void fillFiguresArray() {
        figures = new Area[numberCircle];
        array = new double[numberCircle];
        fillFiguresArrayTriangles();
        fillFiguresArraySquare();
        fillFiguresArrayCircle();
        System.out.println("Area:");
        for (int i = 0; i < numberCircle; i++) {
            System.out.print(array[i] + "  ");
        }
        System.out.println("\n");
    }

    private void fillFiguresArrayTriangles() {
        for (int i = 0; i < numberTriangles; i++) {
            rightTriangle.inputLegs();
            rightTriangle.calculateArea();
            array[i] = rightTriangle.calculateArea();
            figures[i] = rightTriangle;
        }
    }

    private void fillFiguresArraySquare() {
        for (int i = numberTriangles; i < numberSquare; i++) {
            square.inputSide();
            square.calculateArea();
            array[i] = square.calculateArea();
            figures[i] = square;
        }
    }

    private void fillFiguresArrayCircle() {
        for (int i = numberSquare; i < numberCircle; i++) {
            circle.inputRadius();
            circle.calculateArea();
            array[i] = circle.calculateArea();
            figures[i] = circle;
        }
    }

    private int chooseFigure;
    private RightTriangle rightTriangle = new RightTriangle();
    private Square square = new Square();
    private Circle circle = new Circle();
    private int numberTriangles;
    private int numberSquare;
    private int numberCircle;
    private Area[] figures;
    private double[] array;
    private final static Scanner scannerInt = new Scanner(System.in);

}

