package models;

public class University {

    public University(int number, String name) {
        this.number = number;
        this.name = name;
    }

    @Override
    public String toString() {
        return "University{" +
                "number=" + number +
                ", name='" + name + '\'' +
                '}';
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private int number;
    private String name;

}
