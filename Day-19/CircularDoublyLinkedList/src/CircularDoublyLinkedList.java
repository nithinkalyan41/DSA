public class CircularDoublyLinkedList {
    private class Node{
        Node prev;
        int value;
        Node next;
        Node(int value){
            this.value = value;
        }
    }
    Node head;
    int count;
    void addFirst(int value){
        var node = new Node(value);
        if(isEmpty()) {
            head = node;
            head.next = head.prev = node;
        }
        else{
            var current = head.next;
            while(current.next!=head){
                current = current.next;
            }
            node.next = head;
            head.prev = node;
            node.prev = current;
            current.next = node;
            head = node;
        }
    }
    void addLast(int value){
        var node = new Node(value);
        if(isEmpty()) {
            head = node;
            head.next = head.prev = node;
        }
        else{
                var current = head.next;
                while(current.next!=head){
                    current = current.next;
                }
                node.prev = current;
                current.next = node;
                node.next = head;
                head.prev = node;
        }
    }
    void print(){
        if(head!=null){
            System.out.print(head.value+" ");
            var current = head.next;
            while(current!=head){
                System.out.print(current.value+" ");
                current = current.next;
            }
            System.out.println();

        }

    }
    boolean isEmpty(){
        return head==null;
    }
}
