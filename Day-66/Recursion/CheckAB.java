import java.util.Scanner;

public class CheckAB {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String s = sc.next();
    System.out.println(checkAB(s));
  }

  
  private static boolean checkAB(String s) {
      if(s.length()==0){
        return true;
      }
      if(s.charAt(0)=='a'){
        if(s.substring(1).length() > 1 && s.substring(1,3).equals("bb")){
          return checkAB(s.substring(3));
        }else{
          return checkAB(s.substring(1));
        }
      }
      return false;
      
  }
}
