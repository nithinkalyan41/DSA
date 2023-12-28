import java.util.Scanner;

public class ArraySum {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int a[] = new int[n];
    for(int i=0;i<n;i++){
      a[i] = sc.nextInt();
    }
    System.out.println(sum(a,0,n-1));
  }
  static int sum(int[] a,int i,int n){
    if(i>n)
        return 0;
    return a[i]+sum(a,i+1,n);    
  }
}
