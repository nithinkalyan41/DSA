import java.util.Arrays;

public class matrix1 {
  public static void main(String[] args) {
    int a[][] = {{0,1,0,1},
                 {0,0,0,0},
                 {0,0,0,0}};
      int n = a.length;
      int m = a[0].length;
      for(int i=0;i<n;i++){
        for(int j=0;j<m;j++){
          if(a[i][j]==1){
            int r = i-1;
              while(r>=0){
                if(a[r][j]!=1){
                  a[r][j]=-1;
                }
                r--;
              }
              r = i+1;
              while(r<n){
                  if(a[r][j]!=1){
                     a[r][j]=-1;
                    }
                    r++;
              }
              int c = j-1;
              while(c>=0){
                if(a[i][c]!=1){
                  a[i][c]=-1;
                }
                c--;
              }
              c=j+1;
              while(c<m){
                if(a[i][c]!=1){
                  a[i][c]=-1;
                }
                c++;
                
              }
          }
        }
        
      }
      for(int i=0;i<n;i++){
        for(int j=0;j<m;j++){
          if(a[i][j]==-1){
            a[i][j]=1;
          }
        }
      }
      for(int x[] : a){
          System.out.println(Arrays.toString(x));
        }



  }
}
