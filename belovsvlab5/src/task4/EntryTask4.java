package task4;

public class EntryTask4 {

    public void executeTask4() {
            Reader reader = new Reader();
            Book[] books = new Book[5];
            for (int i = 0; i < 5; i++) {
                books[i] = new Book();
            }
            reader.returnBook(5, books);
        }

}
