package seven;

import java.util.Optional;

public class FunctionalOperations {
    public static void main(String[] args) {
        Optional<String> name = Optional.of("Java");
        Optional<String> nullOptional = Optional.ofNullable(null);
        // ifPresent()
//        name.ifPresent((value) -> System.out.println(value));
        name.ifPresent(System.out::println);
        nullOptional.ifPresent(System.out::println);

        // map()
//        Optional<String> upperCase = name.map((value) -> value.toUpperCase());
        Optional<String> upperCase = name.map(String::toUpperCase);
        System.out.println(upperCase.orElse("default"));

        // filter()
//        Optional<String> temp = name.filter(n -> n.startsWith("J"));
//        temp.ifPresent(System.out::println);

    name.filter(n -> n.startsWith("J"))
            .ifPresent(System.out::println);

    // Combine Operation
        name.filter(n -> n.startsWith("J"))
                .map(String::toUpperCase)
                .ifPresent(System.out::println);

    }
}
