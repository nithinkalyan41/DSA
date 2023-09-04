// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
            SinglyLinkedListRecurse ll = new SinglyLinkedListRecurse();
            ll.insertRecurse(ll.head,10);
            ll.insertRecurse(ll.head,20);
            ll.insertRecurse(ll.head,30);
            ll.insertRecurse(ll.head,40);
            ll.insertRecurse(ll.head,50);
            ll.traverse(ll.head);
            ll.removeRec(ll.head);
          System.out.println();
            ll.traverse(ll.head);
    }
}