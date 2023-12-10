import java.util.Scanner;

public class CountOfWords{
   public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String s = sc.nextLine();
    int wordCount = 1;
    for(int i=0;i<s.length();i++){
        if(s.charAt(i)==' '){
            wordCount++;
        }
    }
    if(s.length()==0){
        System.out.println("0 Words");
    }else{
        System.out.println("Count of Words :"+wordCount);
    }
    
   }
}