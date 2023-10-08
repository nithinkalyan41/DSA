public class Main {
    public static void main(String[] args) {
            PriorityQueueWithArray p = new PriorityQueueWithArray();
            p.enqueue(10);
        p.enqueue(50);
        p.enqueue(20);
        p.enqueue(30);
        p.enqueue(40);
        System.out.println(p);
        p.dequeue();
        System.out.println(p);
    }
}