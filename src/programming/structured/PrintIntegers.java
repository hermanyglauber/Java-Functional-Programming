package programming.structured;

import java.util.List;

public class PrintIntegers {

    public static void main(String args[]) {
        List<Integer> numbers = List.of(12, 2, 5, 51, 5, 7);
        printNumbers(numbers);
        printEvenNumbers(numbers);
    }

    private static void printNumbers(List<Integer> numbers) {
        for (int number:numbers) {
            System.out.println(number);
        }
    }

    private static void printEvenNumbers(List<Integer> numbers) {
        for (int number : numbers ) {
            if (number%2 == 0) System.out.println(number);
        }

    }
}
