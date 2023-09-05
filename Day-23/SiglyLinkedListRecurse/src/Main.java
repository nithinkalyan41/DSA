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
        SinglyLinkedListRecurse ll1 = new SinglyLinkedListRecurse();
        ll1.insertRecurse(ll1.head,15);
        ll1.insertRecurse(ll1.head,25);
        ll1.insertRecurse(ll1.head,35);
        ll1.insertRecurse(ll1.head,45);
        ll1.insertRecurse(ll1.head,55);
           SinglyLinkedListRecurse l = SinglyLinkedListRecurse.join(ll,ll1);
           l.traverse(l.head);
    }
}