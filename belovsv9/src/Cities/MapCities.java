package Cities;
import Universety.*;
import java.util.HashMap;
import java.util.Map;

public class MapCities {
    public MapCities() {
        cityMap.put(new University("РУТ", 20000, 1000, 220),
                new City("Москва", 1200000));
        cityMap.put(new University("МГУ", 50000, 2000, 260),
                new City("Москва", 1200000));
        cityMap.put(new University("МФТИ", 10000, 500, 270),
                new City("Долгопрудный", 200000));
        cityMap.put(new University("СПБГУ", 40000, 3000, 250),
                new City("Санкт-Петербург", 8000000));
    }

    public void showCities() {
        City temp = new City();
        System.out.println("Города:");
        for (University un :
                cityMap.keySet()) {
            temp = cityMap.get(un);
            System.out.println(cityMap.get(un).toString() + " кол-во жителей на 1 студента: " + temp.getPopulation() / un.getNumberStudents());
        }

    }

    private Map<University, City> cityMap = new HashMap<>();
}
