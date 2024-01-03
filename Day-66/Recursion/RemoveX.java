import java.util.Scanner;

public class RemoveX {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String s = sc.next();
    System.out.println(removeX(s));
  }

  private static String removeX(String s) {
    return removeX(s,0);
  }

  private static String removeX(String s, int start) {
    if(start==s.length())
          return "";
    if(s.charAt(start)!='x'){
      return s.charAt(start)+removeX(s,start+1);
    }
    return removeX(s,start+1);
  }
  
}
