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
            size++;
        }
    }
    void addLast(int value){
        Node node = new Node(value);
        if(isEmpty())
            head = tail = node;
        else
            tail.next = node;
        tail = node;
        size++;
    }
    void getKthElement(int k){
        if(isEmpty())
            throw new IllegalArgumentException();
        var first = head;
        var second = head;
        for(int i=0;i<k-1;i++){
            second = second.next;
            if(second == null)
                throw new IllegalArgumentException();
        }
        while(second!=tail){
            first = first.next;
            second = second.next;
        }
        System.out.println(first.value);
    }
    void getMiddle(){
        if(isEmpty())
            throw new IllegalArgumentException();
        var first = head;
        var second = head;
        while(second != tail && second.next != tail){
            first = first.next;
            second = second.next.next;
        }
        if(second==tail)
            System.out.println(first.value);
        else
            System.out.println(first.value+" "+first.next.value);
    }

    private boolean isEmpty(){
        return head==null;
    }
}
