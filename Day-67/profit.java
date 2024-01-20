import java.util.List;

public class profit {

    public static int maxProfit(int costPerCut, int salePrice, List<Integer> lengths) {
        int maxProfit = 0;

        for (int saleLength = 1; saleLength <= findMaxLength(lengths); saleLength++) {
            int salePricePerRod = salePrice * saleLength;
            int profit = 0;

            for (int rodLength : lengths) {
                int uniformRods = rodLength / saleLength;

                if (uniformRods > 0) {
                    int extraCut = (rodLength % saleLength > 0) ? 1 : 0;
                    int totalCuts = uniformRods - 1 + extraCut;

                    int costs = totalCuts * costPerCut;
                    int revenues = uniformRods * salePricePerRod;

                    if (revenues > costs) {
                        profit += revenues - costs;
                    }
                }
            }

            if (profit > maxProfit) {
                maxProfit = profit;
            }
        }

        return maxProfit;
    }

    private static int findMaxLength(List<Integer> lengths) {
        int maxLength = 0;
        for (int length : lengths) {
            if (length > maxLength) {
                maxLength = length;
            }
        }
        return maxLength;
    }

    public static void main(String[] args) {
        // Example usage:
        int costPerCut = 1;
        int salePrice = 10;
        List<Integer> lengths = List.of(26,103,59);
        int result = maxProfit(costPerCut, salePrice, lengths);
        System.out.println("Max Profit: " + result);
    }
}

