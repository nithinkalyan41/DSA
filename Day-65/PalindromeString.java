import java.util.Scanner;

public class PalindromeString {
    public static void main(String[] args) {
         
       int n = 10;
       int numStars = 0;
       int i=1;
       while(i<=n){
            int value=1;
            while(value<=n-i+1){
                System.out.print(value);
                value++;
            }
            int stars = 1;
            while(stars <= numStars){
                System.out.print("*");
                stars++;
            }

            value = n-i+1;

            while(value>=1){
                System.out.print(value);
                value--;
            }
            i++;
            numStars+=2;
            System.out.println();
       }

    }


    // 3546 
    // 546
    // 346
    // 356
    // 354

}
