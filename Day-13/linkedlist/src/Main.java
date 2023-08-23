import org.w3c.dom.*;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        LinkedList l = new LinkedList();
        l.addLast(40);
        l.addLast(650);
        l.addLast(500);
        l.addLast(100);
        l.addFirst(150);
        l.addFirst(50);
        l.addLast(120);
        System.out.println(l.valueOf(5));
        System.out.println(l.indexOf(500));
    }
}