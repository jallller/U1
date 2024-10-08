package app;

import org.junit.jupiter.api.Test;

public class TDD {
    public TDD() {

        String name;
    }


    public String greet(String name) {


        if (name == null) {
            System.out.println("Hello my friend");
            return "Hello my friend";

        }
        if (name.equals(name.toUpperCase())) {
            System.out.println("HELLO " + name + "!");
            return "HELLO " + name + "!";

        }

        System.out.println("Hello " + name);
        return "Hello " + name;
    }

    public String greet(String name, String name2) {

        System.out.println("Hello " + name + " and " + name2);
        return "Hello " + name + "and " + name2;

    }

    public String greet(String[] people) {
        if (people == null || people.length == 0) {
            return "Hello, my friend";
        }

        String normalNames = "";
        String upperCaseNames = "";

        for (String person : people) {
            if (person.equals(person.toUpperCase())) {
                upperCaseNames += upperCaseNames.isEmpty() ? "HELLO " + person + "!" : " AND HELLO " + person + "!";
            } else {
                normalNames += normalNames.isEmpty() ? person : " and " + person;
            }
        }


        String result = normalNames.isEmpty() ? "" : "Hello, " + normalNames + ".";
        System.out.println(result);
        return upperCaseNames.isEmpty() ? result : (result.isEmpty() ? upperCaseNames : result + " AND " + upperCaseNames);
    }

    public String greets(String[] person) {
        if (person == null || person.length == 0) {
            return "Hello, my friend";
        }

        String names = "";
        String upperCaseNames = "";

        for (String individual : person) {
            for (String name : individual.split(",\\s*")) {
                if (name.equals(name.toUpperCase())) {
                    upperCaseNames += upperCaseNames.isEmpty() ? "HELLO " + name + "!" : " AND HELLO " + name + "!";
                } else {
                    names += names.isEmpty() ? name : " and " + name;
                }
            }
        }
        String result = "";
        if (!names.isEmpty()) {
            result += "Hello, " + names + ".";
        }
        if (!upperCaseNames.isEmpty()) {
            result += (result.isEmpty() ? "" : " ") + upperCaseNames;
        }

        System.out.println(result);
        return result;
    }

    public String greets2(String[] persons) {
        if (persons == null || persons.length == 0) {
            return "Hello, my friend";
        }

        StringBuilder normalNames = new StringBuilder();
        StringBuilder upperCaseNames = new StringBuilder();

        for (String individual : persons) {

            String[] splitNames = individual.split(",(?=(?:[^\"]*\"[^\"]*\")*[^\"]*$)"); //Splitter navne nå comma
            for (String name : splitNames) {
                name = name.trim();

                if (name.isEmpty()) continue;

                // Check if the name is uppercase
                if (name.equals(name.toUpperCase())) {
                    upperCaseNames.append(upperCaseNames.length() == 0 ? "HELLO " + name + "!" : " AND HELLO " + name + "!");
                } else {
                    normalNames.append(normalNames.length() == 0 ? name : " and " + name);
                }
            }
        }
        String result = "";
        if (normalNames.length() > 0) {
            result += "Hello, " + normalNames + ".";
        }
        if (upperCaseNames.length() > 0) {
            result += (result.isEmpty() ? "" : " ") + upperCaseNames; // Append uppercase names
        }

        System.out.println(result);
        return result;
    }
}


