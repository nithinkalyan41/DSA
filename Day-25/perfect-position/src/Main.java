// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        UpNextList l = new UpNextList();
        l.addAtPosition(60);
        l.addAtPosition(50);
        l.addAtPosition(55);
        l.addAtPosition(10);
        l.addAtPosition(65);
        l.addAtPosition(74);
        l.addAtPosition(80);
        l.addAtPosition(61);
        l.addAtPosition(59);
        l.addAtPosition(59);
        l.printUp();
        System.out.println();
        l.printNext();

    }
}