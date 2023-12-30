import java.util.Arrays;

public class y {
  public static void main(String[] args) {
    int a[][] ={{0, 0, 0},
    {0, 0, 1}};
    int n = a.length;
    int m = a[0].length;
      int r[] = new int[n];
      int c[] = new int[m];
      for(int i=0;i<n;i++){
        for(int j=0;j<m;j++){
          if(a[i][j]==1){
            r[i]=1;
            c[j]=1;
          }
        }
      }
      for(int i=0;i<n;i++){
        for(int j=0;j<m;j++){
          if(r[i]==1 || c[j]==1){
            a[i][j]=1;
          }
        }
      }

    for(int x[] : a){
      System.out.println(Arrays.toString(x));
    }           
  }
}
