// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Queue q = new Queue(6);
        System.out.println(q.isEmpty());
        q.enqueue(40);
        q.enqueue(50);
        q.dequeue();
        System.out.println(q);
        q.enqueue(60);
        System.out.println(q);
        q.dequeue();
        System.out.println(q);
        //System.out.println(q.isEmpty());
    }
}