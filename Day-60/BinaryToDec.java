import java.util.*;
class BinaryToDec {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       String s = sc.next();
       int base = 1;
       int sum = 0;
       for(int i=s.length()-1;i>-1;i--){
           if(s.charAt(i)=='1'){
               sum+=base;
           }
           base *=2;
       }
        System.out.println(sum);
    }
}
