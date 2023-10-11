import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       int n = sc.nextInt();
       print5and6Combo(n);
    }

    private static void print5and6Combo(int n) {
        Queue<String> q = new ArrayDeque<>();
        q.add("5");
        q.add("6");
        for(int i=0;i<n;i++){
            String temp = q.remove();
            System.out.print(temp+" ");
            q.add(temp+"5");
            q.add(temp+"6");
        }
    }
}