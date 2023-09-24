import java.util.EmptyStackException;
import java.util.LinkedList;

public class StackLinkedList<T> {
    private class Node{
        T value;
        Node next;
        Node(T value){
            this.value=value;
        }
    }
    Node top;
    public void push(T value){
        Node node = new Node(value);
        node.next = top;
        top = node;
    }
   public T pop(){
        if (isEmpty())
            throw new EmptyStackException();
        T value = top.value;
        top = top.next;
        return value;
    }
    public T peek(){
        return top.value;
    }
    public boolean isEmpty(){
        return top==null;
    }

    @Override
    public String toString() {
        LinkedList<T> l = new LinkedList<>();
        Node current = top;
        while(current!=null){
            l.addFirst(current.value);
            current = current.next;
        }
        return "" + l +
                "";
    }
}
