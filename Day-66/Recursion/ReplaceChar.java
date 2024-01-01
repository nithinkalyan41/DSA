import java.util.Scanner;

public class ReplaceChar {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String s = sc.next();
    char c = sc.next().charAt(0);
    char d = sc.next().charAt(0);
    System.out.println(replace(s,c,d));
  }

  private static String replace(String s, char c, char d) {

    return  replace(s, c, d,0);
  }

  private static String replace(String s, char c, char r, int start) {
        if(start == s.length())
              return "";
        if(s.charAt(start)==c)
              return 'x'+replace(s, c, r,start+1);      
        return s.charAt(start)+replace(s, c, r,start+1);
  }
}
