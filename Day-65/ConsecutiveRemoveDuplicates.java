import java.util.Scanner;

public class ConsecutiveRemoveDuplicates {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        String s = sc.next();
        String ans = "";
        int n = s.length();
        for(int i=1;i<s.length();i++){
            if(s.charAt(i-1)==s.charAt(i)){
                i++;
            }else{
                ans+=s.charAt(i-1);
                i++;
            }
        }
        if(s.charAt(n-2)!=s.charAt(n-1)){
            ans+=s.charAt(n-1);
        }
        System.out.println(ans);
    }
}
