import task1And2.EntryTask1And2;
import task3.EntryTask3;
import task4.EntryTask4;

import java.util.Scanner;

public class Printer {

    public static void executeTask1And2() {
        System.out.println("Execute task 1,2:");
        EntryTask1And2 entryTask1And2 = new EntryTask1And2();
        System.out.println("Choose your figure: \n1)RightTriangle \n2)Square " +
                "\n3)Circle " + "\n4)Run several figure \n5)Break");
        entryTask1And2.runFigureMenu();
    }

    public static void executeTask3() {
        System.out.println("Execute task 3:");
        EntryTask3 entryTask3 = new EntryTask3();
        entryTask3.executeTask3();
    }

    public static void executeTask4() {
        System.out.println("Execute task 4:");
        EntryTask4.executeTask4();
    }

}
