import java.util.Scanner;

public class LastIndex {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int target = sc.nextInt();
    int a[] = new int[n];
    for(int i=0;i<n;i++){
      a[i]=sc.nextInt();
    }
    System.out.println(lastIndex(a,target,n-1));


    
  }

  private static int lastIndex(int[] a, int target,int index) {
    if(a[index]==target){
      return index;
    }
    if(index<0){
      return -1;
    }
    return lastIndex(a, target, index-1);
  }
}
