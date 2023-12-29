import java.util.Arrays;

public class OccuranceInSortedArray {
  public static void main(String[] args) {
    int a[] = {1,2,2,3,3,4,4,4,5,5};
    int n = a.length;
    int j=0;
    if(a[0]==a[1]){
      System.out.println(a[0]);
    }
    for(int i=0;i<n-1;i++){
        if(a[i]==a[i+1] && a[j]!=a[i]){
          System.out.println(a[i]);
          j=i;
        }
    }
   // System.out.println(Arrays.toString(a));
  }
}
