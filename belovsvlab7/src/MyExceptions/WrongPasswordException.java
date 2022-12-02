package MyExceptions;

public class WrongPasswordException extends Exception {
    public WrongPasswordException(){
        System.out.println("Password exception");
    }

    public WrongPasswordException(String message) {
        super(message);
    }
}
