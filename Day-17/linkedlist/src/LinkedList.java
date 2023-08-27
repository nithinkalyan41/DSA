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
    void removeNode(int index){
        if(index<0 || index>=size)
            throw new IllegalArgumentException();
        int start = 0;
        var current = head;
        while(current!=tail){
            if(start==index-1)
                break;
            start++;
            current = current.next;
        }
        var temp = current.next.next;
        current.next.next=null;
        current.next = temp;
        size--;
    }
    int lastindexOf(int value){
        int i = 0;
        int index = 0;
        var current = head;
        while(current!=null){
            if(current.value==value)
                index = i;
            current = current.next;
            i++;
        }
        return index;
    }
    void removeLastOccurance(int value){
        int index = lastindexOf(value);
        removeNode(index);
        System.out.println(index);
    }
    void removeFirstOccurance(int value){
            int index = getIndex(value);
            removeNode(index);
        System.out.println(index);
    }
    int getIndex(int value){
        Node current = head;
        int start = 1;
        while(current != null){
            if(current.value == value)
                return start;
            current = current.next;
            start++;
        }
        return -1;
    }

    private boolean isEmpty(){
        return head==null;
    }
}
