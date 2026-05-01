package gr.aueb.cf.cf9.ch17.streams;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.stream.Collectors;

public class MainFilter {

    public static void main(String[] args) {
        List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        // filter even numbers
        numbers.stream()
                .filter(num -> num % 2 == 0)        // Intermediate op
                .forEach(System.out::println);             // Terminal op

        Iterable<Integer> evenNumbers = numbers.stream()
                .filter(num -> num % 2 == 0)        // Intermediate op
                .toList();                                 // Unmodifiable list

        List<Integer> evenNumbers2 = numbers.stream()
                .filter(n -> n % 2 == 0)           // Intermediate op
                .collect(Collectors.toList());            // Unmodifiable list
        var evenNumber3 = numbers.stream()
                .filter(n -> n % 2 == 0)
                .toArray();

        List<String> cities = List.of("Athens", "Berlin", "Paris", "Tokyo");

        var filteredCities = cities.stream()
                .filter(city -> city.startsWith("T"))
                .collect(Collectors.toCollection(HashSet::new));

        filteredCities.forEach(System.out::println);

        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        var filteredArr = Arrays.stream(arr)
                .filter(num -> num % 2 == 0)
                .toArray();
    }
}
