import java.util.Scanner;

public class GeometricSum {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    System.out.println(geoSum(n));
  }

  private static double geoSum(int n) {
    if(n==0)
      return 1;
    return geoSum(n-1)+1/Math.pow(2, n);
  }
}
