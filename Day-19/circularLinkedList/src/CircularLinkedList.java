public class CircularLinkedList {
    private class Node{
        int value;
        Node next;
        public Node(int value){
            this.value = value;
        }
    }
    Node head;
    int count;
    public void addFirst(int value) {

        var node = new Node(value);

        if(isEmpty()) {
            head = node;
            head.next = head;
        } else {
            var current = head;
            while (current.next != head)
                current = current.next;
            current.next = node;
            node.next = head;
            head = node;
        }
        count++;
    }
    public void addLast(int value) {
        var node = new Node(value);
        if(isEmpty()) {
            head = node;
            head.next = head;

        } else {
            var current = head.next;
            while (current.next != head) {
                current = current.next;
            }
            current.next = node;
            node.next = head;
        }
        count++;
    }
    boolean isEmpty(){
        return head==null;
    }

    public void print() {
        if(head != null) {
            System.out.print(head.value+" ");
            var current = head.next;
            while (current != head) {
                System.out.print(current.value+" ");
                current = current.next;
            }
        }
        System.out.println();
    }
}
