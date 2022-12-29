package Cities;

import java.util.Objects;

public class City {

    public City() {
    }

    public City(String name, Integer population) {
        this.name = name;
        this.population = population;
    }

    public Integer getPopulation() {
        return population;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        City city = (City) o;
        return Objects.equals(name, city.name) && Objects.equals(population, city.population);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, population);
    }

    @Override
    public String toString() {
        return "Cities.City{" +
                "name='" + name + '\'' +
                ", population=" + population +
                '}';
    }

    private String name;
    private Integer population;
}
