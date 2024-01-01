import java.util.Arrays;
import java.util.Scanner;

public class Minproduct {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int a[] = new int[n];
    int min = Integer.MAX_VALUE;
    for(int i=0;i<n;i++){
      a[i]=sc.nextInt();
      if(a[i]<min){
        min = a[i];
      }
    }
    Arrays.sort(a);
    int x =0;
    if(a[n-1]<0){
        System.out.println(a[n-2]*a[n-1]);
    }
    else if(a[0]<0){
      for(int i=1;i<n;i++){
          if(a[i]>=0){
            x = a[i];
            break;
          }
      }
      System.out.println(x*a[0]);
    }
    else{
      System.out.println(a[0]*a[1]);
    }
  }
}
