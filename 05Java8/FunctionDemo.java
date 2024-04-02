import java.util.function.*;

public class FunctionDemo {
    public static void main(String[] args) {
        // Example 1: Function<T, R>
        Function<Integer, String> convertToString = num -> "Number: " + num;
        int number = 10;
        String result = convertToString.apply(number);
        System.out.println(result);

        // Example 2: BiFunction<T, U, R>
        BiFunction<String, Integer, String> formatMachineInfo = (type, id) -> "Machine Type: " + type + ", Machine ID: " + id;
        String machineType = "Harvester";
        int machineId = 1234;
        String formattedInfo = formatMachineInfo.apply(machineType, machineId);
        System.out.println(formattedInfo);

        // Example 3: UnaryOperator<T>
        UnaryOperator<Integer> square = num -> num * num;
        int inputValue = 5;
        int squaredValue = square.apply(inputValue);
        System.out.println("Square of " + inputValue + " is: " + squaredValue);

        // Example 4: BinaryOperator<T>
        BinaryOperator<Integer> sum = (num1, num2) -> num1 + num2;
        int num1 = 10;
        int num2 = 20;
        int total = sum.apply(num1, num2);
        System.out.println("Sum of " + num1 + " and " + num2 + " is: " + total);
    }
}
