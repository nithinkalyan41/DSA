import java.util.Arrays;
import java.util.Scanner;

public class MergeSort1 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int a[] = new int[n];
    for(int i=0;i<n;i++){
      a[i]=sc.nextInt();
    }
    System.out.println(Arrays.toString(a));
    mergeSort(a);
    System.out.println(Arrays.toString(a));
  }

  private static void mergeSort(int[] a) {
    if(a.length<=1){
      return;
    }

    int p1[] = new int[a.length/2];
    for(int i=0;i<a.length/2;i++){
      p1[i]=a[i];
    }
    int k = 0;
    int p2[] = new int[a.length-a.length/2];
    for(int i=a.length/2;i<a.length;i++){
      p2[k++]=a[i];
    }
    mergeSort(p1);
    mergeSort(p2);
    mergerSorted(p1, p2, a);
  }

  private static void mergerSorted(int[] p1, int[] p2,int[] a) {
    int i=0,j=0,k=0;
    while(i<p1.length && j<p2.length){
      if(p1[i]<p2[j]){
        a[k++]=p1[i++];
      }else{
        a[k++]=p2[j++];
      }
    }
    while(i<p1.length){
      a[k++]=p1[i++];
    }
      while(j<p2.length){
      a[k++]=p2[j++];
    }
  }
}
