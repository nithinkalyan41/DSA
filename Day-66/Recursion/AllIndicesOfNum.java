import java.util.Scanner;

public class AllIndicesOfNum {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int target = sc.nextInt();
    int a[] = new int[n];
    for(int i=0;i<n;i++){
      a[i]=sc.nextInt();
    }
    printIndices(a,target,0);
  }

  private static void printIndices(int[] a, int target,int index) {
    if(index==a.length)
          return;
    if(a[index]==target){
          System.out.println(index);
    }
    printIndices(a, target, index+1);
  }
}
