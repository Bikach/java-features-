package example;

import java.util.stream.Stream;

public class Iterate {
    public static void main(String[] args) {
        Stream.iterate(0, n -> n <= 10, n -> n + 2)
                .forEach(System.out::println);
    }
}
