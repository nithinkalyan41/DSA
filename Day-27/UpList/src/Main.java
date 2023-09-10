// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        UpList l = new UpList();
       l.add(50);
       l.add(40);
       l.add(60);
       l.add(45);
       l.add(35);
       l.add(65);
       l.add(58);
        System.out.println(l.search(58));
        l.minElement(l.head);
        l.maxElement(l.head);
//        l.printNext();
//        System.out.println();
//        l.printUp();

    }
}