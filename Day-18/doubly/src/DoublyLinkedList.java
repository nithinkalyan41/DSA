public class DoublyLinkedList {
    private class Node{
        Node prev;
        int value;
        Node next;
        public Node(int value){
            this.value = value;
        }
    }
    Node head;
    Node tail;
    private int count;
    void addLast(int value){
        Node node = new Node(value);
        if(head==null)
            head=tail=node;
        else
            tail.next=node;
            node.prev= tail;
            tail=node;
            count++;
    }
    void addFirst(int value){
        Node node = new Node(value);
        if(head==null)
            head=tail=node;
        else
          node.next=head;
          head.prev=node;
          head = node;
          count++;
    }
    void addAt(int index,int value){
        if(index<0 ||  index>count)
            throw new IllegalArgumentException();
        if(index==0) {
            addFirst(value);
            return;
        }
        if(index==count) {
            addLast(value);
            return;
        }
        var node = new Node(value);
        int start = 0;
        var current = head;
        while (start < index-1){
            current = current.next;
            start++;
        }
        node.next = current.next;
        current.next.prev = node;
        current.next = node;
        node.prev = current;
        count++;
    }
    void print(){
        var current = head;
        while(current!=null){
            System.out.print(current.value+" ");
            current = current.next;
        }
    }
    void printReverse(){
        var current = tail;
        while(current!=null){
            System.out.print(current.value+" ");
            current = current.prev;
        }
        //System.out.println(isEmpty());
    }
    void removeFirst(){
        if(head==tail)
            head = tail = null;
        else {
            var node = head.next;
            head.next = null;
            node.prev = null;
            head = node;
            count--;
        }
    }
    void removeLast(){
        if(head==tail)
            head=tail=null;
        else{
            var node = tail.prev;
            tail.prev = null;
            node.next = null;
            tail = node;
            count--;
        }

    }
    int getindex(int value){
        var current = head;
        int start =0;
        while(current!=null){
            if(current.value == value)
                return start;
            current = current.next;
            start++;
        }
        return -1;
    }
    int indexOf(int value){
            return getindex(value);
    }
    int lastIndexOf(int value){
        var current = tail;
        int start = count;
        while(current!=null){
            if(current.value==value)
                return start;
            current = current.prev;
            start--;
        }
        return -1;
    }
    public int size(){
        return count;
    }
    private boolean isEmpty(){
        return head==null;
    }
}
