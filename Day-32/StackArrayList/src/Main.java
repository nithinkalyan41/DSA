import java.util.ArrayList;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
     Stack<Integer> s = new Stack<>();
     s.push(50);
     s.push(60);
        System.out.println(s.peek());
        System.out.println(s.size());
     s.pop();
        System.out.println(s.size());
        System.out.println(s);

    }
}