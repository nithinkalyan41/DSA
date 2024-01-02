import java.util.Arrays;
import java.util.Scanner;

public class mergeSortWithIndex {
public static void main(String[] args) {
  Scanner sc = new Scanner(System.in);
  int n = sc.nextInt();
  int a[] = new int[n];
  for(int i=0;i<n;i++){
    a[i]=sc.nextInt();
  }
  System.out.println(Arrays.toString(a));
  mergSort(a);
  System.out.println(Arrays.toString(a));
}

private static void mergSort(int[] a) {
  mergSort(a,0,a.length-1);
}

private static void mergSort(int[] a, int s, int e) {
  if(s>=e){
    return;
  }
  int mid = (s+e)/2;
  mergSort(a, s, mid);
  mergSort(a, mid+1, e);
  merge(a,s,e);
}

private static void merge(int[] a, int s, int e) {
  int mid = (s+e)/2;
  int i=s,j=mid+1,k=0;
  int ans[] = new int[e-s+1];
  while(i<=mid && j<=e){
    if(a[i]<a[j]){
      ans[k++]=a[i++];
    }else{
      ans[k++]=a[j++];
    }
  }
  while(i<=mid){
    ans[k++]=a[i++];
  }
  while (j<=e) {
    ans[k++]=a[j++];
  }
  for(int ind=0;ind<ans.length;ind++){
    a[s+ind]=ans[ind];
  }
}

}
