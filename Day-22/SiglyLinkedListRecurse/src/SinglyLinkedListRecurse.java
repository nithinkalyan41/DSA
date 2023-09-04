public class SinglyLinkedListRecurse {
    private  class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
        }
    }
    Node head;
    void insertRecurse(Node node,int data){
        if(node==null){
            head = new Node(data);
            return;
        } else if (node.next == null) {
            node.next = new Node(data);
            return;
        }
        insertRecurse(node.next,data);
    }
    void traverse(Node start){
        if(start == null){
            return;
        }
        System.out.print(start.data+" ");
        traverse(start.next);
    }
    void removeRec(Node node){
        if(node == null){
            throw new IllegalStateException();
        } else if (node.next == null) {
            head=null;
            return;
        } else if (node.next.next == null) {
            node.next = null;
            return;
        }
        removeRec(node.next);
    }
}
