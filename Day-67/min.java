public class min {
  public static void main(String[] args) {
    int n = 9;
    System.out.println(minSq(n));
    
  }

  private static int minSq(int n) {
    if(n<=1 || n==2 || n==3 || n==0){
      return n;
    }
    int min = Integer.MAX_VALUE;
    for(int i=1;i*i<=n;i++){
      min = Math.min(min,1+minSq(n-i*i));
    }
    return min;
  }
}
