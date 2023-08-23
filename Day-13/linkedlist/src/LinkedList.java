public class LinkedList{
    private class Node{
        private int value;
        private Node next;
        public Node(int value){
            this.value = value;
        }
    }
    private Node head;
    private Node tail;
    void addLast(int value){
        Node node = new Node(value);
        if(isEmpty()){
            head=tail=node;
        }else{
            tail.next = node;
            tail = node;
        }
    }
    void addFirst(int value){
        Node node = new Node(value);
        if(isEmpty()){
            head=tail=node;
        }else{
            node.next = head;
            head = node;
        }
    }
    int valueOf(int index){
        int start = 0;
        Node current = head;
        while(current != null) {
            if (start == index)
                return current.value;
            current= current.next;
            start++;
        }
        return -1;
    }
    int indexOf(int value){
        int index = 0;
        Node current = head;
        while(current!=null){
            if(current.value == value)
                return index;
            current = current.next;
            index++;
        }
        return -1;
    }
    private boolean isEmpty(){
        return head==null;
    }

}
