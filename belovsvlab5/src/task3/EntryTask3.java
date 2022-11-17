package task3;

import executeForAnonimus.ExecuteTask;

public class EntryTask3 implements ExecuteTask {

    public void executeTask3() {
        entryTask3.executeTask();
    }

    EntryTask3 entryTask3 = new EntryTask3() {

        @Override
        public  void executeTask() {
            Phone phone1 = new Phone();
            Phone phone2 = new Phone("70000000", "Classic1", 200);
            Phone phone3 = new Phone("7456567", "Classic2");
            phone1.showInfo();
            phone2.showInfo();
            phone3.showInfo();
            phone1.receiveCall("Petr", "78797456");
            Phone[] phones = new Phone[5];
            for (int i = 0; i < 5; i++)
                phones[i] = phone1;
            phone1.sendMessage(phones);
            this.getClass();
        }
    };

}
