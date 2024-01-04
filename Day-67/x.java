public class x {
  public static void main(String[] args) {
    int a[] = {1,2,3,4,5};
    int b[] = {2,3,4,5,6};
    boolean[] printed = new boolean[a.length];
    for(int i=0;i<a.length;i++){
      for(int j=0;j<b.length;j++){
        if(a[i]==b[j] && !printed[i]){
          System.out.println(a[i]);
          printed[i]=true;
        }
      }
    }
  }
}
