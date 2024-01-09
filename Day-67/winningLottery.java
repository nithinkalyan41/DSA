import java.util.Arrays;
import java.util.Scanner;

public class winningLottery {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int d = sc.nextInt();
    int s = sc.nextInt();
    int a[] = new int[d];

    int sum = s-1;
    for(int i=d-1;i>=0;i--){
      if (i == 0) {
        a[0] = sum + 1;
        break;
    }
        if(sum >= 9){
          a[i]=9;
          sum-=9;
        }else{
          a[i]=sum;
          sum=0;
        }
    }
    if(a[0]>9){
      System.out.println(-1);
    }else{
      for(int i=0;i<d;i++){
        System.out.print(a[i]);
      }
    }
   
  }
}
