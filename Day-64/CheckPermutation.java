import java.util.Scanner;

public class CheckPermutation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String t = sc.next();
        if(s.length()!=t.length()){
            System.out.println(false);
            return;
        }
        int sx = 0;
        int tx = 0;
        for(int i=0;i<s.length();i++){
            sx += s.charAt(i);
            tx += t.charAt(i);
        }
        boolean ans = (sx==tx) ? true : false;
        System.out.println(ans);
        
    }
}
