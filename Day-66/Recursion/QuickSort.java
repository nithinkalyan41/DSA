import java.util.Arrays;
import java.util.Scanner;

public class QuickSort {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int a[] = new int[n];
    for(int i=0;i<n;i++){
      a[i]=sc.nextInt();
    }
    quickSort(a,0,a.length-1);
    System.out.println(Arrays.toString(a));
  }

  private static void quickSort(int[] a, int s, int e) {
    if(s>=e){
      return;
    }
    int partitionIndex = partition(a,s,e);
    quickSort(a, s, partitionIndex-1);
    quickSort(a, partitionIndex+1,e);
  }

  private static int partition(int[] a, int s, int e) {
    int pivot = a[s];
    int count =0;
    for(int i=s+1;i<=e;i++){
      if(a[i]<=pivot){
        count++;
      }
    }
    int pI = s+count;
    a[s]= a[pI];
    a[pI]=pivot;
    int i=s,j=e;
    while(i<j){
      while(i<=e && a[i]<=pivot){
        i++;
      }
      while(a[j]>pivot){
        j--;
      }
      if(i<=j){
        int temp = a[i];
        a[i]=a[j];
        a[j]=temp;
        i++;
        j--;
      }
    }
    return pI;
  }
}
