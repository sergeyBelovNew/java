package Universety;

import java.util.HashSet;
import java.util.Set;

public class SetUniversity {

    public SetUniversity() {
        formationTechnicalSet();
        formationHumanitiesSet();
        formationMixedSet();
    }

    public void showAll() {

        System.out.println("Все университеты:");
        for (University un :
                allUniversities) {
            System.out.println(un.toString() + " отношение студентов к преподователям - "  +
                    un.getNumberStudents() / un.getNumberTeachers());
        }
    }

    public void showTechnical() {
        System.out.println("\n\nТехнические университеты:");
        for (University un :
                technicalUniversities) {
            System.out.println(un.toString() + " отношение студентов к преподователям - " +
                    un.getNumberStudents() / un.getNumberTeachers());
        }
    }

    public void showHumanities() {
        System.out.println("\n\nГуманитарные университеты:");
        for (University un :
                humanitiesUniversities) {
            System.out.println(un.toString() + " отношение студентов к преподователям - "  +
                    un.getNumberStudents() / un.getNumberTeachers());
        }
    }

    public void showMixed() {
        System.out.println("\n\nСмешанные университеты:");
        for (University un :
                mixedUniversities) {
            System.out.println(un.toString() + " отношение студентов к преподователям - "  +
                    un.getNumberStudents() / un.getNumberTeachers());
        }

    }

    private void formationTechnicalSet() {
        technicalUniversities.add(new University("МФТИ", 10000, 500, 280));
        technicalUniversities.add(new University("РУТ", 20000, 1000, 210));
        technicalUniversities.add(new University("ДВГУПС", 18000, 1000, 210));
        technicalUniversities.add(new University("МГУ", 58000, 5000, 260));
        allUniversities.addAll(technicalUniversities);
    }

    private void formationHumanitiesSet() {
        humanitiesUniversities.add(new University("МГУ", 58000, 5000, 260));
        humanitiesUniversities.add(new University("СПБГУ", 48000, 5000, 260));
        humanitiesUniversities.add(new University("ВШЭ", 38000, 5000, 260));
        allUniversities.addAll(humanitiesUniversities);
    }

    private void formationMixedSet() {
        mixedUniversities.addAll(allUniversities);
        mixedUniversities.retainAll(humanitiesUniversities);
        mixedUniversities.retainAll(technicalUniversities);
    }

    private Set<University> allUniversities = new HashSet<>();
    private Set<University> technicalUniversities = new HashSet<>();
    private Set<University> humanitiesUniversities = new HashSet<>();
    private Set<University> mixedUniversities = new HashSet<>();
}
