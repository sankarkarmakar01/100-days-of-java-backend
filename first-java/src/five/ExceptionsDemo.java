package five;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class ExceptionsDemo {
    public static void main(String[] args) {
//        int a = 10;
//        int result = 10 / 0;
//        System.out.println("Done");

        try {
            // EXCEPTION GENERATING STATEMENTS
            int result = 10 / 0;
        } catch (ArithmeticException e) {
            // EXCEPTION HANDLING STATEMENT
            System.out.println("In Catch Block");
        }
        System.out.println("Done");

        int[] a = {1,2,3};
//        System.out.println(a[6]);

        try {
            System.out.println(a[6]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array Index Overflow...");
            System.out.println(e.getMessage());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("Finally");
        }


        try {
            FileReader fileReader = new FileReader("abc.txt");
        } catch (FileNotFoundException e) {
//            throw new RuntimeException(e);
            System.out.println("Runtime Exception");
        }

    }
}
