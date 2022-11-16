import task1And2.Printer;
import task3.*;
import task4.Book;
import task4.Reader;

import java.util.Scanner;

public class main {

    public static void main(String[] args) {
        executeTask1And2();
        executeTask3();
        executeTask4();
    }

    public static void executeTask1And2() {
        int chooseFigure;
        Printer printer = new Printer();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Choose your figure: \n1)task1And2.RightTriangle \n2)task1And2.Square " +
                "\n3)task1And2.Circle " + "\n4)Run several figure \n5)Break");
        chooseFigure = scanner.nextInt();
        printer.runFigureMenu(chooseFigure);
    }

    public static void executeTask3() {
        Phone phone1 = new Phone();
        Phone phone2 = new Phone("70000000", "Classic", 200);
        Phone phone3 = new Phone();
        phone3.inputAll();
        phone1.showInfo();
        phone2.showInfo();
        phone3.showInfo();
        phone1.receiveCall("Petr", "78797456");
        //testing sendMessage
        Phone[] phones = new Phone[5];
        for (int i = 0; i < 5; i++)
            phones[i] = phone1;
        phone1.sendMessage(phones);
    }

    public static void executeTask4() {
        Reader reader = new Reader();
        Book []books = new Book[5];
        for(int i = 0; i < 5; i++){
            books[i] = new Book();
        }
        reader.returnBook(5, books);
    }

}
