// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        UpList l = new UpList();
        l.addNext(10);
        l.addNext(40);
        l.addUp(20);
        l.addUp(30);
        l.printNext();
        System.out.println();
        l.printUp();
    }
}