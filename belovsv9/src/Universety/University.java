package Universety;

import java.util.Objects;

public class University {
    public University() {
    }

    public University(String name, int numberStudents, int numberTeachers, int averagePassingScore) {
        this.name = name;
        this.numberStudents = numberStudents;
        this.numberTeachers = numberTeachers;
        this.averagePassingScore = averagePassingScore;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        University that = (University) o;
        return numberStudents == that.numberStudents && numberTeachers == that.numberTeachers && averagePassingScore == that.averagePassingScore && Objects.equals(name, that.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, numberStudents, numberTeachers, averagePassingScore);
    }

    @Override
    public String toString() {
        return "Universety.University{" +
                "name='" + name + '\'' +
                ", numberStudents=" + numberStudents +
                ", numberTeachers=" + numberTeachers +
                ", averagePassingScore=" + averagePassingScore +
                '}';
    }

    public String getName() {
        return name;
    }

    public int getNumberStudents() {
        return numberStudents;
    }

    public int getNumberTeachers() {
        return numberTeachers;
    }

    public int getAveragePassingScore() {
        return averagePassingScore;
    }

    private String name;
    private int numberStudents;
    private int numberTeachers;
    private int averagePassingScore;
}
