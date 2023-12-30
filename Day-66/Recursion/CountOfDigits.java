import java.util.Scanner;

public class CountOfDigits {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    
    System.out.println(countOfZeros(n));
    
  }

  private static int countOfZeros(int n) {
    if(n<10){
      if(n==0){
        return 1;
      }else{
        return 0;
      }
    }
    if(n%10==0){
      return 1+countOfZeros(n/10);
    }
    return countOfZeros(n/10);
  }
}
