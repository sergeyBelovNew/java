package task4;

import java.util.Random;

public class Book {

    public Book(){
        author = "Pushkin";
        title = "Boris Godunov";
    }

    public void outputBook(){
        System.out.println("Author: " + author + " Title: " + title);
    }

    private String author;
    private String title;
    private Random random = new Random();

}
