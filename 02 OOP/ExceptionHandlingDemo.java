import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;

public class ExceptionHandlingDemo {
    public static void main(String[] args) {
       /* checkedExceptionDemo();
        runtimeExceptionDemo(6);*/
        showMeRuntimeException();
        try{
            customExceptionDemo();
        } catch (MyCustomException e) {
            System.out.println(e);
        }
        System.out.println("Real End");
    }

    public static void customExceptionDemo() throws MyCustomException {
        MyCustomException me = new MyCustomException("I created my custom exception");
        throw me;
    }

    public static void showMeRuntimeException() {
        try {
            runtimeExceptionDemoWithPropagation(7);
        }catch (RuntimeException e){
            System.out.println("ALso Handeled at showMeRuntimeException");
        }
    }

    public static void runtimeExceptionDemoWithPropagation(int n) {
        int[] numbers = {1, 2, 3, 4, 5};
        try {
            for (int i = 0; i < n; i++) {
                System.out.println("Number at " + i + " is " + numbers[i]);
            }
        } catch(RuntimeException e) {
            System.out.println("There's a Runtime Exception and " + e.getMessage());
            throw e;
        }
        System.out.println("END");
    }

    public static void runtimeExceptionDemo(int n) {
        int[] numbers = {1, 2, 3, 4, 5};
        try {
            for (int i = 0; i < n; i++) {
                System.out.println("Number at " + i + " is " + numbers[i]);
            }
        } catch(RuntimeException e) {
            System.out.println("There's a Runtime Exception and " + e.getMessage());
        }
        System.out.println("END");
    }

    public static void checkedExceptionDemo() {
        BufferedReader reader = null;
        try {
            reader = new BufferedReader(new FileReader("demo.txt"));
            String line;
            while((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (FileNotFoundException fe){
            System.out.println("Cannot Find File");
        } catch (IOException ioe){
            System.out.println("IO Exception While reading lines");
        } finally {
            // Closing the file in the finally block to ensure it's always closed
            try {
                if (reader != null) {
                    reader.close();
                }
            } catch (IOException e) {
                // Handling any IOException that may occur while closing the file
                System.err.println("Error closing the file: " + e.getMessage());
            }
        }
    }

}
