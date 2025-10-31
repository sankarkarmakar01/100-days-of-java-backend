package six;

@FunctionalInterface
interface BookAction {
    void perform();
}

// parameter -> expression body
// () -> {}

// Functional Interface with Parameters
@FunctionalInterface
interface Operation {
    int add(int a, int b);
}

public class FunctionalInterfaceDemo {
    public static void main(String[] args) {
        // Step 1
        BookAction action1 = new BookAction() {
            @Override
            public void perform() {
                System.out.println("Action Performed 1");
            }
        };
        action1.perform();

        // Step 2
        BookAction action2 = () -> {
            System.out.println("Action Performed 2");
        };
        action2.perform();

        // Step 3
        BookAction action3 =() -> System.out.println("Action Performed 3");
        action3.perform();

        // Operation
        Operation operation = (int a, int b) -> {
            return a + b;
        };
        System.out.println("Sum: " + operation.add(10,5));
    }
}
