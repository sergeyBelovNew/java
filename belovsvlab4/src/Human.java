

import java.util.Scanner;

public class Human {
    public static void main(String[] args) {
        //1.     Человек
        Scanner scan = new Scanner(System.in);
        System.out.println("Человек:");
        Human human1 = new Human();
        human1.setName("Вася");
        human1.setSurname("Белов");
        System.out.println("Введите возраст");
        human1.setDateOfBirth(scan.nextInt());
        human1.showAll();
        scan.close();
    }
    public  void showAll(){
        System.out.println("Имя: "+this.getName());
        System.out.println("Фамилия: "+this.getSurname());
        System.out.println("Дата рождения: "+this.getDateOfBirth());
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(int dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    private String name;
    private String surname;
    private int dateOfBirth;
    private final int currentYear = 2022;
}
