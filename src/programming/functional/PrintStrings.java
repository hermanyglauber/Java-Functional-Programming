package programming.functional;

import java.util.List;

public class PrintStrings {

    public static void main(String[] args) {
        List<String> teams = List.of("Gremio FBPA", "Internacional", "Gremio Bage", "Gremio Santanense", "Avenida", "Santa Cruz");
        printAll(teams);
        printGremios(teams);
        printLE10chars(teams);
    }

    private static void printAll(List<String> teams) {
        teams.stream().forEach(System.out::println);
    }

    private static void printGremios(List<String> teams) {
        teams.stream().filter(team -> team.contains("Gremio")).forEach(System.out::println);
    }

    private static void printLE10chars(List<String> teams) {
        teams.stream().filter(team -> team.length() <= 10).forEach(System.out::println);
    }
}
