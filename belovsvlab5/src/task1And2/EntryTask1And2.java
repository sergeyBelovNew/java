package task1And2;

import java.util.Scanner;

public class EntryTask1And2 {

    public void runFigureMenu(int chooseFigure) {
        while (chooseFigure != 5) {
            switch (chooseFigure) {
                case 1:
                    executeCaseRightTriangle();
                case 2:
                    executeCaseSquare();
                case 3:
                    executeCaseCircle();
                case 4:
                    runSeveralFigure();
                default:
                    break;
            }
            System.out.println("Choose next figure");
            chooseFigure = scannerInt.nextInt();
        }
    }

    private void executeCaseRightTriangle(){
        RightTriangle rightTriangle = new RightTriangle();
        rightTriangle.inputLegs();
        rightTriangle.calculateArea();
        rightTriangle.showInformationRightTriangle();
    }

    private void executeCaseSquare(){
        Square square = new Square();
        square.inputSide();
        square.calculateArea();
        square.showInformationSquare();
    }

    private void executeCaseCircle(){
        Circle circle = new Circle();
        circle.inputRadius();
        circle.calculateArea();
        circle.showInformationCircle();
    }
//need fix
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

    private void fillFiguresArrayTriangles(){
        RightTriangle rightTriangle = new RightTriangle();
        for (int i = 0; i < numberTriangles; i++) {
            rightTriangle.inputLegs();
            rightTriangle.calculateArea();
            array[i] = rightTriangle.getArea();
            figures[i] = rightTriangle;
        }
    }

    private void fillFiguresArraySquare(){
        Circle circle = new Circle();
        for (int i = numberSquare; i < numberCircle; i++) {
            circle.inputRadius();
            circle.calculateArea();
            array[i] = circle.getArea();
            figures[i] = circle;
        }
    }

    private void fillFiguresArrayCircle(){
        for (int i = numberSquare; i < numberCircle; i++) {
            Circle circle = new Circle();
            circle.inputRadius();
            circle.calculateArea();
            array[i] = circle.getArea();
            figures[i] = circle;
        }
    }

    private int chooseFigure;
    private int numberTriangles;
    private int numberSquare;
    private int numberCircle;
    private Area[] figures;
    private double[] array;
    private final static Scanner scannerInt = new Scanner(System.in);

}

