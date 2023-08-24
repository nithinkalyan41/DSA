import java.util.NoSuchElementException;

public class LinkedList {
    private class Node{
        private int value;
        private Node next;
        public Node(int value){
            this.value = value;
        }
    }
    Node head;
    Node tail;
    private int size;
    void addFirst(int value){
        Node node = new Node(value);
        if(isEmpty()) {
            head = tail = node;
        }
        else{
            node.next = head;
            head = node;
        }
    }
    void addLast(int value){
        Node node = new Node(value);
        if(isEmpty())
            head = tail = node;
        else
            tail.next = node;
            tail = node;
    }
    int getIndex(int value){
        Node current = head;
        int start = 0;
        while(current != null){
            if(current.value == value)
                return start;
            current = current.next;
            start++;
        }
        return -1;
    }
    int getvalue(int index){
        Node current = head;
        int start = 0;
        while(current != null){
            if(start==index)
                return current.value;
            current = current.next;
            start++;
        }
        return -1;
    }
    void removeFirst(){
        if(isEmpty())
            return;
        Node temp = head.next;
        head.next = null;
        head = temp;
    }
    void removeLast(){
        if(isEmpty())
            return;
        if(head==tail) {
            head = tail = null;
        }else {
            Node current = head;
            while (current.next != tail) {
                current = current.next;
            }
            current.next = null;
            tail = current;
        }
    }
    void reverse(){
        if(isEmpty()) return;

        var previous = head;
        var current = head.next;
        while(current != null){
            var next = current.next;
            current.next = previous;
            previous = current;
            current = next;
        }
        tail = head;
        tail.next = null;
        head = previous;

    }
    void removeNode(int index){

    }

    private boolean isEmpty(){
        return head==null;
    }
}
