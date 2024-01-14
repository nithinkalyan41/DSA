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
  public int strDist(String str, String sub) {
    if(str.length()<sub.length())
        return 0;
    if(str.substring(0,sub.length()).equals(sub) && str.substring(str.length()-sub.length()).equals(sub)){
       return str.length();
    }
       
    return strDist(str.substring(0, str.length()-1), sub);    
  }
  
  
  
}
