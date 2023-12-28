import java.util.Scanner;

public class linearSearch {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int a[] = new int[n];
    for(int i=0;i<n;i++){
      a[i] = sc.nextInt();
    }
    int target = sc.nextInt();
    System.out.println(check(a,0,n-1,target));
  }
  static boolean check(int[] a,int i,int n,int target){

    if(i>n){
      return false;
    }
    if(a[i]==target){
      return true;
    }
    return check(a, i+1, n, target);
  }
}
