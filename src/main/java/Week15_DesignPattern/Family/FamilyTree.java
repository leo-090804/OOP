package Week15_DesignPattern.Family;

import java.util.ArrayList;
import java.util.List;

public class FamilyTree {
    public static void main(String[] args) {
        Person james = new Person("James", "Male", "01/01/1980");
        Person hana = new Person("Hana", "Female", "01/01/1982");
        Person ryan = new Person("Ryan", "Male", "01/01/2005");
        Person kai = new Person("Kai", "Male", "01/01/2008");
        Person jennifer = new Person("Jennifer", "Female", "01/01/2010");

        Person child1 = new Person("Adrian", "Male", "01/01/2020");
        Person child2 = new Person("Ken", "Male", "01/12/2021");
        Person child3 = new Person("Barbie", "Female", "31/01/2018");
        Person child4 = new Person("Jen", "Female", "01/01/2017");

        james.marry(hana);
        james.addChild(ryan);
        james.addChild(kai);

        kai.marry(jennifer);

        kai.addChild(child1);
        kai.addChild(child2);
        kai.addChild(child3);
        kai.addChild(child4);

        child1.marry(new Person("Unknown", "Unknown", "Unknown"));
        child2.marry(new Person("Unknown", "Unknown", "Unknown"));
        child3.marry(new Person("Unknown", "Unknown", "Unknown"));
        child4.marry(new Person("Unknown", "Unknown", "Unknown"));

        System.out.println("Not married: ");
        findUnmarried(james);

        System.out.println("Have two children: ");
        findMarriedCoupleWithTwoChildren(james);

        System.out.println("Latest generations: ");
        findLatestGeneration(james);
    }

    private static void findUnmarried(Person person) {
        if (!person.isMarried()) {
            System.out.println(person.getName());
        }

        List<Person> children = person.getChildren();
        for (Person child : children) {
            findUnmarried(child);
        }
    }

    private static void findMarriedCoupleWithTwoChildren(Person person) {
        if (person.isMarried() && person.getChildren().size() == 2) {
            System.out.println(person.getName() + " and " + person.getSpouse().getName());
        }

        List<Person> children = person.getChildren();
        for (Person child : children) {
            findMarriedCoupleWithTwoChildren(child);
        }
    }

    private static void findLatestGeneration(Person person) {
        List<Person> latestGeneration = new ArrayList<>();
        findLatestGenerationUtil(person, latestGeneration);

        for (Person p : latestGeneration) {
            System.out.println(p.getName());
        }
    }

    private static void findLatestGenerationUtil(Person person, List<Person> latestGeneration) {
        List<Person> children = person.getChildren();
        if (children.isEmpty()) {
            latestGeneration.add(person);
            return;
        }

        for (Person child : children) {
            findLatestGenerationUtil(child, latestGeneration);
        }
    }
}