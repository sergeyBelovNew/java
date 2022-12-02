package MyExceptions;

public class WrongLoginException extends Exception{
    public WrongLoginException(){
        System.out.println("Login Exception");
    }

    public WrongLoginException(String message) {
        super(message);
    }
}
