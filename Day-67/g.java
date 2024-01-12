import java.util.Arrays;

public class g {
  public static void main(String[] args) {
    int s = 9;
    int d = 2;
    int a[] = new int[d];
    int sum = s-1;
    for(int i=d-1;i>=0;i--){
      if(i==0){
        a[i]=sum+1;
        break;
      }
      if(sum>=9){
        a[i]=9;
        sum-=9;
      }else{
          a[i]=sum;
          sum=0;
      }
    }
    for(int x : a){
      System.out.print(x);
    }

  }
}
