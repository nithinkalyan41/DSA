import java.util.Scanner;

class Factorial{
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println(fact(sc.nextInt()));
  }
  static int fact(int n){
    if(n==1){
      return 1;
    }
    return n*fact(n-1);
  }
}