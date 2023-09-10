public class SinglyLinkedList {
    Node head;
    private class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
        }
    }
    void traverse(Node node){
        if(node == null)
            return;
        System.out.print(node.data+" ");
        traverse(node.next);
    }
    void addLast(Node node,int data){
        if(head == null){
            head = new Node(data);
            return;
        }
        if(node.next == null){
            node.next = new Node(data);
            return;
        }
        addLast(node.next,data);
    }
    void revKNodes(int k){
        if(head==null)
            throw new IllegalStateException();
        if(head.next == null){
            System.out.print(head.data+" ");
            return;
        }
        var prev = head;
        var current = head.next;
        var next = current.next;
        int c = 1;
        while(c < k){
            current.next = prev;
            prev = current;
            current = next;
            if(current.next != null)
                next = current.next;
            c++;
        }
        head.next = current;
        head = prev;
    }
}
