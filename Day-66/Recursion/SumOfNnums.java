import java.util.Scanner;

public class SumOfNnums {
  public static void main(String[] args) {
   Scanner sc = new Scanner(System.in);
   print(sc.nextInt());
  }
  static void print(int n){
    if(n==0){
      return;
    }
    print(n-1);
    System.out.println(n);
  }
}
