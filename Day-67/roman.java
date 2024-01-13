import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class roman {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] numbers = new int[n];
        for (int i = 0; i < n; i++) {
            numbers[i] = scanner.nextInt();
        }
        String[] romanNumerals = romanizer(numbers);
        for (String numeral : romanNumerals) {
            System.out.println(numeral);
        }
    }

    private static String[] romanizer(int[] numbers) {
        ArrayList<String> result = new ArrayList<>();

        for (int num : numbers) {
            result.add(convertToRoman(num));
        }

        return result.toArray(new String[0]);
    }

    private static String convertToRoman(int num) {
        HashMap<Integer, String> romanMap = new HashMap<>();
        romanMap.put(1, "I");
        romanMap.put(4, "IV");
        romanMap.put(5, "V");
        romanMap.put(9, "IX");
        romanMap.put(10, "X");
        romanMap.put(40, "XL");
        romanMap.put(50, "L");
        romanMap.put(90, "XC");
        romanMap.put(100, "C");
        romanMap.put(400, "CD");
        romanMap.put(500, "D");
        romanMap.put(900, "CM");
        romanMap.put(1000, "M");

        StringBuilder romanNumeral = new StringBuilder();

        // Iterate through the reference values in descending order
        for (int value : new int[]{1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1}) {
            while (num >= value) {
                num -= value;
                romanNumeral.append(romanMap.get(value));
            }
        }

        return romanNumeral.toString();
    }
}