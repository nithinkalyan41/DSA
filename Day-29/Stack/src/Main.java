// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
                int a[] = {1,2,5,85,6,3,4};
                for(int x : a){
                    System.out.println(x); //O(n)
                }
                for(int i=0;i<a.length;i++){ //O(n)
                  for(int j=i+1;j<a.length;j++){ //O(n)
                      if(a[i]+a[j]==5){
                          System.out.println(true);
                          return;
                      }
                  }//O(n) * O(n) = O(n^2)
                }

                //Total program = O(n) +O(n^2)
                // = O(n^2)


        System.out.println(false);
    }
}