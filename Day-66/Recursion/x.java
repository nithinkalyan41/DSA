public class x {
    public static void main(String[] args) {
      int a[] = {1,1,2,3,4};
      if(a.length==1){ //
        System.out.println(-1);
        return;
      }
      boolean yes = false;
      if(a[0]==a[1]){ // true
        System.out.println(a[0]); // 1 1 
        yes = true;
      }
      int j = 0;// 0
      for(int i=1;i<a.length-1;i++){ // 7 a[8]
        if(a[i]==a[i+1] && a[i]!=a[j]){
          System.out.println(a[i]+" ");
          j=i;
          yes = true;
        }
      }
      if(yes==false){
        System.out.println(-1);
      }
    }
}
