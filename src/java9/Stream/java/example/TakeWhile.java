package example;

import java.util.stream.Stream;

public class TakeWhile {
    public static void main(String[] args) {
        Stream.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
                .takeWhile(n -> n <= 5)
                .forEach(System.out::println);
    }
}
