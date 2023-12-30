import java.util.Scanner;

public class FirstIndex {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int x = sc.nextInt();

    int a[] = new int[n];
    for(int i=0;i<n;i++){
      a[i]=sc.nextInt();
    }
    System.out.println(firstIndex(a,x,0));
  }

  private static int firstIndex(int a[],int x,int index) {
        if(a[index]==x){
          return index;
        }
        if(index==a.length-1){
          return -1;
        }

        return firstIndex(a, x, index+1);
    
  }
}
