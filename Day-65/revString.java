import java.util.Scanner;

public class revString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String rev="";
        int last = s.length()-1;
        while(last>-1){
            rev+=s.charAt(last--);
        }
        System.out.println(rev);
    }
}
