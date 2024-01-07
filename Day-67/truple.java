public class truple {
  public static void main(String[] args) {
    int a[]={2,3,1,6};
    int d = 3;
    int x = fin(a,d);
    System.out.println(x);
  }

  private static int fin(int[] a, int d) {
    int c =0;
    for(int i=0;i<a.length-2;i++){
      for(int j=i+1;j<a.length-1;j++){
        for(int k=j+1;k<a.length;k++){
          if((a[i]+a[j]+a[k])%d==0){
            c++;
          }
        }
      }
    }
    return c;
  }
}
