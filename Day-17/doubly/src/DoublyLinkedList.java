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
    void addLast(int value){
        Node node = new Node(value);
        if(head==null)
            head=tail=node;
        else
            tail.next=node;
            node.prev= tail;
            tail=node;
    }
    void addFirst(int value){
        Node node = new Node(value);
        if(head==null)
            head=tail=node;
        else
          node.next=head;
          head.prev=node;
          head = node;
    }
}
