import java.util.Scanner;

public class ReplcaePi {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String s = sc.next();
    System.out.println(replace(s));
  }

  private static String replace(String s) {
    String res = "";
    if(s.length()<=1)
          return s;
    String sub = replace(s.substring(1));
    if(s.charAt(0)=='p' && sub.charAt(0)=='i'){
      res = "3.14"+sub.substring(1);
    }
    else{
      res=s.charAt(0)+sub;            
    }
    return res;            
  }
}
