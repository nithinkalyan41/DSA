// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
            CircularLinkedList cll = new CircularLinkedList();
            cll.addLast(10);
            cll.addLast(20);
            cll.addLast(20);
            cll.addLast(30);
            cll.addLast(30);
            cll.addLast(30);
            cll.addLast(40);
            cll.addLast(40);
            cll.removeDupilcates();
            cll.addAtRightSlot(25);
            cll.addAtRightSlot(35);
            cll.addAtRightSlot(55);
            cll.addAtRightSlot(2);
            cll.addAtRightSlot(4);
            cll.print();
    }
}