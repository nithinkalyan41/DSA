import java.util.Scanner;

public class BinarySearch {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int target = sc.nextInt();
    int a[] = new int[n];
    for(int i=0;i<n;i++){
      a[i]=sc.nextInt();
    }

    System.out.println(binarySearch(a,target));
  }

  private static int binarySearch(int[] a, int target) {
    return binarySearch(a,0,a.length-1,target);
  }

  private static int binarySearch(int[] a, int s, int e, int target) {
    if(s>e){
      return -1;
    }
    int mid = (s+e)/2;
    if(a[mid]==target)
        return mid;
    if(a[mid]>target)
        return binarySearch(a,s,mid-1, target);
    else
        return binarySearch(a, mid+1, e, target);        
  }
}
