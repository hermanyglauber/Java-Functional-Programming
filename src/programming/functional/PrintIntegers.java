package programming.functional;

import java.util.List;

public class PrintIntegers {

    public static void main(String[] args) {
        List<Integer> numbers = List.of(12, 2, 5, 51, 5, 7);
        printNumbers(numbers);
        printEvenNumbers(numbers);
    }

    private static void printNumbers(List<Integer> numbers) {
        numbers.stream().forEach(System.out::println);
    }

    private static void printEvenNumbers(List<Integer> numbers) {
        numbers.stream().filter(number -> number%2 == 0).forEach(System.out::println);
    }
}
