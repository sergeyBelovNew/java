import MyExceptions.WrongLoginException;
import MyExceptions.PasswordConfirmException;
import MyExceptions.WrongPasswordException;

import java.util.Scanner;

public class EntryTask {

    public static void setDate() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите логин");
        String login = scanner.next();
        System.out.println("Введите пароль");
        String password = scanner.next();
        System.out.println("Подтвердите пароль");
        String confirmPassword = scanner.next();
        checkAll( login, password, confirmPassword);
    }

    private static boolean checkAll(String login,String password, String confirmPassword) {
        try {
            checkLogin(login);
            checkPassword(password);
            checkPasswordConfirm(confirmPassword, password);
            return true;
        } catch (WrongLoginException exceptionLogin) {
            exceptionLogin.printStackTrace();
        } catch (WrongPasswordException passwordException) {
            passwordException.printStackTrace();
        } catch (PasswordConfirmException passwordConfirmException) {
            passwordConfirmException.printStackTrace();
        }
            return false;
    }

    private static void checkLogin(String login) throws WrongLoginException {
        if (!login.matches("^[a-zA-Z0-9]+$"))
            throw new WrongLoginException();
    }

    private static void checkPassword(String password) throws WrongPasswordException {
        if (!(password.matches("^[a-zA-Z0-9]+$") || password.length() < 20))
            throw new WrongPasswordException();
    }

    private static void checkPasswordConfirm(String passwordConfirm, String password) throws PasswordConfirmException {
        if (!passwordConfirm.equals(password))
            throw new PasswordConfirmException();
    }

}
