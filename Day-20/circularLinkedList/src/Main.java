// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
            CircularLinkedList cll = new CircularLinkedList();
            cll.addFirst(40);
            cll.addFirst(50);
            cll.addLast(60);
            cll.addLast(70);
            cll.addFirstOptimised(100);
            cll.addFirstOptimised(1000);
            cll.addLastOptimised(1000);
            cll.addLastOptimised(10000);
            cll.removeFirst();
            cll.removeLast();
            cll.print();
    }
}