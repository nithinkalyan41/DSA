import java.util.Scanner;
public class PalindromeString {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String s = sc.next();
    System.out.println(isPalindrome(s));
  }

  private static boolean isPalindrome(String s) {
    return isPalindrome(s,0,s.length()-1);
  }

  private static boolean isPalindrome(String s, int start, int end) {
    if(start>end){
          return true;
    }
    if(s.charAt(start)!=s.charAt(end)){
       return false;
    }
    return isPalindrome(s,start+1,end-1);
  }
}
