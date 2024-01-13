import java.util.Scanner;

public class ParentBit {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String s = sc.next();
    System.out.println(parentBit(s));
  }
  static String parentBit(String s){
    return pB(s, 0);

  }
  public static String pB(String s, int start){
      if(start == s.length()){
        return "";
      }
      if(s.charAt(start)==')'){
        return ")";
      }
  }
  
}
