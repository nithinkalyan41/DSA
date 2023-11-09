import java.io.FilterOutputStream;

public class Main {
    public static void main(String[] args) {
        Tree t = new Tree();
        t.insert(45);
        t.insert(15);
        t.insert(10);
        t.insert(20);
        t.insert(12);
        t.insert(79);
        t.insert(55);
        t.insert(90);
        t.insert(50);
        t.insert(46);
      /*  System.out.println(t.find(20));
        System.out.println("Pre Order");
        t.printPreOrder(t.root);
        System.out.println("\nPost Order");
        t.printPostOrder(t.root);
        System.out.println("\nInOrder");
        t.printInOrder(t.root);
        System.out.println("\nMin value : "+t.printMin(t.root));
        System.out.println(t.printHeight(t.root));*/
        t.nodeAtKDis(3);
        System.out.println(t.isBST());

    }
}