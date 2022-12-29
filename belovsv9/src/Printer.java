import Cities.MapCities;
import Universety.SetUniversity;

public class Printer {
    public static void runUniversities(){
        SetUniversity setUniversity = new SetUniversity();
        setUniversity.showAll();
        setUniversity.showTechnical();
        setUniversity.showHumanities();
        setUniversity.showMixed();
    }

    public static void runCities(){
        MapCities mapCities = new MapCities();
        System.out.println("\n\n");
        mapCities.showCities();
    }
}
