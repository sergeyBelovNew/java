package task4;

import java.util.Arrays;
import java.util.Scanner;

public class Reader {

    public void takeBook(int numberBookNames, Book[] books) {
        System.out.println("Student" + surname + " " + name + " " + secondName + "takes:");
        for (int i = 0; i < numberBookNames; i++) {
            book = books[i];
            book.outputBook();
        }
    }

    public void takeBook(int numberBookNames, String[] books) {
        System.out.println("Student" + surname + " " + name + " " + secondName + "takes:");
        for (int i = 0; i < numberBookNames; i++)
            System.out.println(books[i]);
    }

    public void takeBook(int numberTakenBooks) {
        System.out.println("Student" + surname + " " + name + " " + secondName + "take" + numberTakenBooks + " books");
    }

    public void returnBook(int numberBookNames, Book[] books) {
        System.out.println("Student" + surname + " " + name + " " + secondName + "returns:");
        for (int i = 0; i < numberBookNames; i++) {
            book = books[i];
            book.outputBook();
        }
    }

    public void returnBook(int numberBookNames, String[] books) {
        System.out.println("Student" + surname + " " + name + " " + secondName + "returns:");
        for (int i = 0; i < numberBookNames; i++)
            System.out.println(books[i]);
    }

    public void returnBook(int numberTakenBooks) {
        System.out.println("Student" + surname + " " + name + " " + secondName + "return" + numberTakenBooks + " books");
    }


    private Book book = new Book();
    private String name;
    private String surname;
    private String secondName;
    private String numberLibraryTicket;
    private String faculty;
    private String dateOfBirth;
    private String phoneNumber;
    private Scanner scannerString = new Scanner(System.in);

}
