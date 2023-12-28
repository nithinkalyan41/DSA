import java.util.Scanner;

public class NoOfDigits {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println(countOfDigit(sc.nextInt()));
  }
  static int countOfDigit(int n){
    if(n==0){
      return 0;
    }
    return 1+countOfDigit(n/10);
  }
}
