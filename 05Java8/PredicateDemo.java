import java.util.function.BiPredicate;
import java.util.function.DoublePredicate;
import java.util.function.IntPredicate;
import java.util.function.LongPredicate;
import java.util.function.Predicate;

public class PredicateDemo {
    public static void main(String[] args) {
        // Example 1: Predicate<T>
        Predicate<Integer> isEven = num -> num % 2 == 0;
        int number = 10;
        boolean result = isEven.test(number);
        System.out.println(number + " is even? " + result);

        // Example 2: BiPredicate<T, U>
        BiPredicate<String, Integer> isMachineIdValid = (machineType, id) -> {
            // Simulate validation logic
            return machineType.equals("Harvester") && id > 1000;
        };
        String machineType = "Harvester";
        int machineId = 1234;
        boolean isValid = isMachineIdValid.test(machineType, machineId);
        System.out.println("Is machine ID " + machineId + " valid for " + machineType + "? " + isValid);

        // Example 3: IntPredicate
        IntPredicate isPositive = num -> num > 0;
        int intValue = 5;
        boolean isPositiveInt = isPositive.test(intValue);
        System.out.println(intValue + " is positive? " + isPositiveInt);

        // Example 4: LongPredicate
        LongPredicate isDivisibleByFive = num -> num % 5 == 0;
        long longValue = 25L;
        boolean isDivisible = isDivisibleByFive.test(longValue);
        System.out.println(longValue + " is divisible by 5? " + isDivisible);

        // Example 5: DoublePredicate
        DoublePredicate isGreaterThanZero = num -> num > 0.0;
        double doubleValue = -3.5;
        boolean isPositiveDouble = isGreaterThanZero.test(doubleValue);
        System.out.println(doubleValue + " is greater than zero? " + isPositiveDouble);
    }
}
