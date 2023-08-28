// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
            DoublyLinkedList l = new DoublyLinkedList();
            l.addLast(20);
            l.addLast(40);
            l.addFirst(10);
            l.addLast(50);
            l.addLast(60);
            l.print();
            System.out.println();
            l.removeFirst();
            l.print();
            l.removeLast();
            System.out.println();
            l.print();
            System.out.println();
            l.addAt(3,101);
        System.out.println();

        l.addLast(40);
        l.addFirst(40);

        l.addLast(40);
        l.print();
        System.out.println(l.lastIndexOf(40));
    }
}