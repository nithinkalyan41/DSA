import java.util.Scanner;

public class SumOfDigits {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    System.out.println(sum(n));
  }

  private static int sum(int n) {
      if(n==0)
          return n;
      return (n%10)+sum(n/10);
    
  }
  
}
