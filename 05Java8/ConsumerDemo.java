import java.util.ArrayList;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.IntConsumer;
import java.util.function.LongConsumer;
import java.util.function.ObjIntConsumer;
import java.util.function.ObjLongConsumer;

public class ConsumerDemo {
    public static void main(String[] args) {
        // Example 1: Consumer<T>
        Consumer<String> printMachineStatus = status -> System.out.println("Machine Status: " + status);
        String machineStatus = "Running";
        printMachineStatus.accept(machineStatus);

        // Example 2: BiConsumer<T, U>
        BiConsumer<String, Integer> printMachineInfo = (name, id) -> {
            System.out.print("Machine Name: " + name);
            System.out.print(", Machine ID: " + id + "\n");
        };
        String machineName = "Harvester";
        int machineId = 1234;
        printMachineInfo.accept(machineName, machineId);

        // Example 3: IntConsumer
        IntConsumer printSensorReading = reading -> System.out.println("Sensor Reading: " + reading);
        int sensorReading = 75;
        printSensorReading.accept(sensorReading);

        // Example 4: LongConsumer
        LongConsumer printTimestamp = timestamp -> System.out.println("Timestamp: " + timestamp);
        long timestamp = System.currentTimeMillis();
        printTimestamp.accept(timestamp);

        // Example 5: ObjIntConsumer
        ObjIntConsumer<String> printFarmArea = (farmName, area) -> System.out.println("Farm Area of " + farmName + ": " + area + " acres");
        String farmName = "Wheat Field";
        int farmArea = 100;
        printFarmArea.accept(farmName, farmArea);

        // Example 6: ObjLongConsumer
        ObjLongConsumer<String> printFarmHarvest = (farmNam, harvest) -> System.out.println("Harvest of " + farmNam + ": " + harvest + " tons");
        long harvestAmount = 5000L;
        printFarmHarvest.accept(farmName, harvestAmount);
    }
}
