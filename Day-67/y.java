import java.util.Scanner;

public class y {

    public static int countCriticalReadings(String readings) {
        String[] readingsArray = readings.split(";");
        int criticalCount = 0;

        for (String reading : readingsArray) {
            if (reading.trim().equalsIgnoreCase("critical")) {
                criticalCount++;
            }
        }

        return criticalCount;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the patient readings
        System.out.println("Enter the patient vital signs readings separated by ';':");
        String patientReadings = scanner.nextLine();

        int criticalCount = countCriticalReadings(patientReadings);

        System.out.println("Output:");
        System.out.println(criticalCount);

        scanner.close();
    }
}
