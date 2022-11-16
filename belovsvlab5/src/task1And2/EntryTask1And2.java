package task1And2;

import java.util.Scanner;

public class EntryTask1And2 {

    public void runFigureMenu(int chooseFigure) {
        while (chooseFigure != 5) {
            switch (chooseFigure) {
                case 1:
                    executeCaseRightTriangle();
                    System.out.println("Choose next figure");
                    chooseFigure = scannerInt.nextInt();
                case 2:
                    executeCaseSquare();
                    System.out.println("Choose next figure");
                    chooseFigure = scannerInt.nextInt();
                case 3:
                    executeCaseCircle();
                    System.out.println("Choose next figure");
                    chooseFigure = scannerInt.nextInt();
                case 4:
                    runSeveralFigure();
                    System.out.println("Choose next figure");
                    chooseFigure = scannerInt.nextInt();
                default:
                    break;
            }
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

    private void runSeveralFigure() {
        System.out.println("Input number of right triangles, that you want: ");
        numberTriangles = scannerInt.nextInt();
        System.out.println("Input number of squares, that you want: ");
        numberSquare = scannerInt.nextInt();
        numberSquare += numberTriangles;
        System.out.println("Input number of circles, that you want: ");
        numberCircle = scannerInt.nextInt();
        numberCircle += numberSquare;
        fillAreaArray(numberTriangles, numberSquare, numberCircle);
    }

    private void fillAreaArray(int numberTriangles, int numberSquare, int numberCircle) {
        Area[] figures = new Area[numberCircle];
        double[] array = new double[numberCircle];
        for (int i = 0; i < numberTriangles; i++) {
            RightTriangle rightTriangle = new RightTriangle();
            rightTriangle.inputLegs();
            rightTriangle.calculateArea();
            array[i] = rightTriangle.getArea();
            figures[i] = rightTriangle;
        }
        for (int i = numberTriangles; i < numberSquare; i++) {
            Square square = new Square();
            square.inputSide();
            square.calculateArea();
            array[i] = square.getArea();
            figures[i] = square;
        }
        for (int i = numberSquare; i < numberCircle; i++) {
            Circle circle = new Circle();
            circle.inputRadius();
            circle.calculateArea();
            array[i] = circle.getArea();
            figures[i] = circle;
        }
        System.out.println("Area:");
        for (int i = 0; i < numberCircle; i++) {
            System.out.print(array[i] + "  ");
        }
        System.out.println("\n");
    }

    private int chooseFigure;
    private int numberTriangles;
    private int numberSquare;
    private int numberCircle;
    private Area[] figures = new Area[numberCircle];
    private final static Scanner scannerInt = new Scanner(System.in);

}

