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
        System.out.println(t.find(20));
    }
}