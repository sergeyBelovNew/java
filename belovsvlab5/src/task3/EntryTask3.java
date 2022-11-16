package task3;

public class EntryTask3 {

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

}
