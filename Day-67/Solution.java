import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

class Result {
    private static final int MOD = 1000000007;
    private static final int MOD_10_8 = (int) Math.pow(10, 8) + 7;
    private static Map<Integer, Integer> memoization = new HashMap<>();

    public static void numberBST(List<Integer> numbers) {
        for (int i = 0; i < numbers.size(); i++) {
            int numNodesTmp = numbers.get(i);
            System.out.println(totalNumberBTS(numNodesTmp));
        }
    }

    public static int totalNumberBTS(int numNodes) {
        if (memoization.containsKey(numNodes)) {
            return memoization.get(numNodes);
        }
        if (numNodes == 0 || numNodes == 1) {
            return 1;
        }

        long combinations = 0;
        for (int j = 1; j <= numNodes; j++) {
            combinations = (combinations + ((long) totalNumberBTS(j - 1) * totalNumberBTS(numNodes - j)) % MOD_10_8)
                    % MOD_10_8;
        }
        memoization.put(numNodes, (int) combinations);
        return (int) combinations;
    }
}

public class Solution {
    public static void main(String[] args) throws IOException {
       Scanner sc = new Scanner(System.in);
       int n = sc.nextInt();
       List<Integer> l = new ArrayList<>();
       for(int i=0;i<n;i++){
        l.add(sc.nextInt());
       }
       Result r = new Result();
       r.numberBST(l);
    }
}


