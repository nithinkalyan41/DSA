// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
            Deque<String> q = new Deque<>();
            q.offerLast("spotify");
            q.offerLast("zomato");
            q.offerFirst("cricbuzz");
            q.offerFirst("Zarchiever");
            q.print();
            System.out.println(q.peekLast());
            q.pollLast();
            q.print();
            System.out.println(q.peekFirst());
            q.pollFirst();
            q.print();
        System.out.println(q.isEmpty());
        System.out.println(q.size());

    }
}
class Deque<T>{
    private class Node{
        Node prev;
        T data;
        Node next;
        Node(T data){
            this.data = data;
        }
    }
    private Node front;
    private Node rear;
    private int count;
    public void offerFirst(T data){
        Node node = new Node(data);
        if(front==null)
            front=rear=node;
        else {
            node.next = front;
            front.prev = node;
            front = node;
        }
        count++;
    }
    public void offerLast(T data){
        Node node = new Node(data);
        if(front==null)
            front=rear=node;
        else {
            rear.next = node;
            node.prev = rear;
            rear = node;
        }
        count++;
    }
    public T pollFirst(){
        if(front==null)
            throw new IllegalStateException();
        else if(front.next == null){
            T frontData = front.data;
            front = null;
            count--;
            return frontData;
        }else{
            T frontData = front.data;
            Node secondNode = front.next;
            front.next = null;
            front = secondNode;
            front.prev = null;
            count--;
            return frontData;
        }
    }
    public T pollLast(){
        if(front==null)
            throw new IllegalStateException();
        else if(front.next == null){
            T rearData = rear.data;
            rear = null;
            count--;
            return rearData;
        }else{
            T rearData = rear.data;
            rear = rear.prev;
            rear.next = null;
            count--;
            return rearData;
        }
    }
    public T peekFirst(){
        if(isEmpty())
            throw  new IllegalStateException();
        return front.data;
    }
    public T peekLast(){
        if(isEmpty())
            throw  new IllegalStateException();
        return rear.data;
    }
    public int size(){
        return count;
    }
    public boolean isEmpty(){
        return count==0;
    }
    public void print(){
        Node current = front;
        while(current!=null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }

}