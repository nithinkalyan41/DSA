import java.util.Scanner;

public class PowerOf2OrNot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if((n&(n-1))==0)
            System.out.println("Yes");
        else
            System.out.println("No");

    }
}