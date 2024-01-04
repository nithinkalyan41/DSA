import java.util.Scanner;

public class StairCase {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      System.out.println(countStairs(n));
    }

    private static int countStairs(int n) {
      if(n<0)
        return 0;
      if(n==0)
          return 1;
      return countStairs(n-1)+countStairs(n-2)+countStairs(n-3);
    }
  
}