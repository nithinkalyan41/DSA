import java.util.*;
public class DecimalToBinary{
	public static void main(String args[]){
	Scanner sc = new Scanner(System.in);
	int x = sc.nextInt();
       String res = "";
       while(x>=1){
           int temp = x%2;
           res = temp+res;
           x /=2;
       }
        System.out.println(res);
   }
}        
