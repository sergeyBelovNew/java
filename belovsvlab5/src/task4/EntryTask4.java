package task4;

import executeForAnonimus.ExecuteTask;

public class EntryTask4 implements ExecuteTask {

    public void executeTask4() {
            Reader reader = new Reader();
            Book[] books = new Book[5];
            for (int i = 0; i < 5; i++) {
                books[i] = new Book();
            }
            reader.returnBook(5, books);
        }

}
