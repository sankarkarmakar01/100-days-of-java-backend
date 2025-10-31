package seven;

import java.util.Optional;

public class NPEDemo {
    public static void main(String[] args) {
        String name = "Java";
        if(name != null) {
            System.out.println(name.length());
        } else {
            System.out.println(name.length());
        }

        // Creating Optional
        Optional<String>  optionalString = Optional.of("Java");
        System.out.println(optionalString);

        Optional<String> empty = Optional.empty();
        System.out.println(empty);

        Optional<String> maybe = Optional.ofNullable(null);
        System.out.println(maybe);

        // Checking Values
        System.out.println(optionalString.isPresent());
        System.out.println(maybe.isPresent());

        System.out.println(optionalString.isEmpty());
        System.out.println(maybe.isEmpty());

        // get()
        System.out.println(optionalString.get());
//        System.out.println(maybe.get()); // Exception


        // orElse("default-value)
        System.out.println(optionalString.orElse("default"));
        System.out.println(maybe.orElse("default"));
        System.out.println(maybe.orElse(null));
        String temp = maybe.orElse("default");

        // orElseGet(<supplier>)
        String result1 = maybe.orElseGet(() -> {
            System.out.println("Generating Default Value");
            return "default";
        });
        System.out.println(result1);
        String result2 = optionalString.orElseGet(() -> {
            System.out.println("Generating Default Value");
            return "default";
        });
        System.out.println(result2);

        // orElseThrow()
        String newResult2 = optionalString.orElseThrow(
                () -> new RuntimeException("Not Found")
        );
        System.out.println(newResult2);
        String newResult1 = maybe.orElseThrow(
                () -> new RuntimeException("Not Found")
        );
        System.out.println(newResult1);

    }
}
