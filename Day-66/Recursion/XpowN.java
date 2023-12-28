import java.util.Scanner;

/**
 * XpowN
 */
public class XpowN {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println(xPowN(sc.nextInt(),sc.nextInt()));
  }
  static int xPowN(int x,int n){
    if(n==0)
        return 1;
    return x*xPowN(x, n-1);    
  }
  
}