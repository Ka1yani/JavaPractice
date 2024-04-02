import java.nio.charset.Charset;
import java.util.Random;
import java.util.function.*;

public class SupplierDemo {
    public static void main(String[] args) {

        //Main example : Supplier<T>
        Supplier<String> machineStatusSupplier = () -> {
            // Simulate fetching machine status from database or IoT device
            return fetchMachineStatus();
        };
        System.out.println("Machine Status : " + machineStatusSupplier.get());

        // Example 1: IntSupplier
        IntSupplier machineIdSupplier = () -> {
            // Simulate fetching machine ID from database or IoT device
            return generateRandomInt(1000, 9999);
        };
        int machineId = machineIdSupplier.getAsInt();
        System.out.println("Machine ID: " + machineId);

        // Example 2: BooleanSupplier
        BooleanSupplier maintenanceRequiredSupplier = () -> {
            // Simulate checking maintenance status of machine
            return generateRandomBoolean();
        };
        boolean maintenanceRequired = maintenanceRequiredSupplier.getAsBoolean();
        System.out.println("Maintenance Required: " + maintenanceRequired);

        // Example 3: LongSupplier
        LongSupplier sensorReadingSupplier = () -> {
            // Simulate fetching sensor readings from IoT device
            return generateRandomLong(0L, 100L);
        };
        long sensorReading = sensorReadingSupplier.getAsLong();
        System.out.println("Sensor Reading: " + sensorReading);

        // Example 4: DoubleSupplier
        DoubleSupplier temperatureSupplier = () -> {
            // Simulate fetching temperature data from sensors
            return generateRandomDouble(0.0, 50.0);
        };
        double temperature = temperatureSupplier.getAsDouble();
        System.out.println("Temperature: " + temperature + " °C");

    }


    // Utility method to simulate fetching machine status
    private static String fetchMachineStatus() {
        // Simulate fetching machine status
        // For example, querying a database or retrieving from IoT device
        // Here, we'll simulate a random machine status for demonstration purposes
        String[] machineStatuses = {"Running", "Idle", "Needs Maintenance"};
        int randomIndex = (int) (Math.random() * machineStatuses.length);
        return machineStatuses[randomIndex];
    }

    // Utility methods for generating random data
    private static int generateRandomInt(int min, int max) {
        return new Random().nextInt(max - min + 1) + min;
    }

    private static boolean generateRandomBoolean() {
        return new Random().nextBoolean();
    }

    private static long generateRandomLong(long min, long max) {
        return min + (long) (Math.random() * (max - min));
    }

    private static double generateRandomDouble(double min, double max) {
        return min + (max - min) * new Random().nextDouble();
    }
}
