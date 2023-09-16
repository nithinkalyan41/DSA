// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
                SinglyLinkedList l = new SinglyLinkedList();
                l.addLast(l.head,1);
                l.addLast(l.head,20);
                l.addLast(l.head,3);
                l.addLast(l.head,40);
                l.addLast(l.head,5);
                l.traverse(l.head);
                Node seg = l.segregate(l.head);
                System.out.println();
                l.traverse(seg);
//                l.addLast(l.head,60);
//                l.addLast(l.head,70);
//                l.addLast(l.head,80);
//                l.addLast(l.head,90);
//                l.traverse(l.head);
//                //l.revKNodes(3);
//                l.revKNodesKTimes(3);
//                System.out.println();
//                l.traverse(l.head);
       
    }
}