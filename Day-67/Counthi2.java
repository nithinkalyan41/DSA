import java.util.Scanner;

public class Counthi2 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String s = sc.next();
    System.out.println(countHi(s));
  }

  private static int countHi(String s) {
      if(s.length()<1){
        return 0;
      }
      else if(s.charAt(0)=='x' && s.charAt(1)=='h' && s.charAt(2)=='i'){
        return countHi(s.substring(3));
      }else if(s.charAt(0)=='h' && s.charAt(1)=='i'){
        return  1+countHi(s.substring(2));
      }
      return countHi(s.substring(1));
    
  }
}
