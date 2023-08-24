// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        LinkedList l = new LinkedList();
        l.addLast(20);
//        l.addLast(30);
//        l.addLast(10);
        //l.addFirst(10);
        l.removeFirst();
        System.out.println(l.getIndex(20));
    }
}