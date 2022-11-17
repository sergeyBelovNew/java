import task1And2.EntryTask1And2;
import task3.EntryTask3;
import task4.EntryTask4;

public class Printer {

    public static void executeTask1And2() {
        System.out.println("Execute task 1,2:");
        EntryTask1And2 entryTask12 = new EntryTask1And2();
        System.out.println("""
                Choose your figure:\s
                1)RightTriangle\s
                2)Square\s
                3)Circle\s
                4)Run several figure\s
                5)Break""");
        entryTask12.runEntry();
    }

    public static void executeTask3() {
        System.out.println("Execute task 3:");
        EntryTask3 entryTask3 = new EntryTask3();
        entryTask3.executeTask3();
    }

    public static void executeTask4() {
        System.out.println("Execute task 4:");
        EntryTask4 entryTask4 = new EntryTask4();
        entryTask4.executeTask4();
    }

}
