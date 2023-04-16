package example;

import java.util.stream.Stream;

public class OfNullable {
    public static void main(String[] args) {
        Stream<String> emptyStream = Stream.ofNullable(null);
        emptyStream.forEach(System.out::println);
    }
}
