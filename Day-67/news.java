import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class news{

    public static List<Integer> getTotalExecutionTime(int n, List<String> logs) {
        List<Integer> result = new ArrayList<>(n);
        Stack<Integer> stack = new Stack<>();
        int prevTimestamp = 0;

        for (int i = 0; i < n; i++) {
            result.add(0);
        }

        for (String log : logs) {
            String[] parts = log.split(":");
            int functionId = Integer.parseInt(parts[0]);
            String operation = parts[1];
            int timestamp = Integer.parseInt(parts[2]);

            if (operation.equals("start")) {
                if (!stack.isEmpty()) {
                    result.set(stack.peek(), result.get(stack.peek()) + timestamp - prevTimestamp);
                }

                stack.push(functionId);
                prevTimestamp = timestamp;

            } else {
                int endedFunction = stack.pop();
                int executionTime = timestamp - prevTimestamp + 1;
                result.set(endedFunction, result.get(endedFunction) + executionTime);
                prevTimestamp = timestamp + 1;
            }
        }

        return result;
    }

    public static void main(String[] args) {
        List<String> logs = List.of("0:start:0", "1:start:3", "1:end:6", "0:end:10");
        int n = 2;
        List<Integer> exclusiveTimes = getTotalExecutionTime(n, logs);

        for (int i = 0; i < exclusiveTimes.size(); i++) {
            System.out.println("Function " + i + ": " + exclusiveTimes.get(i));
        }
    }
}
