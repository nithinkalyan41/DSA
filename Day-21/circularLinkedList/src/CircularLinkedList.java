import javax.swing.tree.AbstractLayoutCache;

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
    public void addFirstOptimised(int value){
        var node = new Node(value);
        if(isEmpty()) {
            head = node;
            head.next = head;
        }
        else{
            int temp = node.value;
            node.value = head.value;
            head.value = temp;
            node.next = head.next;
            head.next = node;
        }
    }
    public void addLastOptimised(int value){
        addFirstOptimised(value);
        head = head.next;
    }
    public void removeFirst(){
        if(head != null) {
            var current = head.next;
            while (current.next != head) {
                current = current.next;
            }
            head = head.next;
            current.next=head;
        }
    }
    public void removeLast(){
        if(head != null) {
            var current = head.next;
            while (current.next.next != head) {
                current = current.next;
            }
            current.next=head;
        }
    }
    void removeDupilcates(){
        if(isEmpty())
            throw new IllegalStateException();
        var prev = head;
        var current = head.next;
        while(current!=head){
            if(prev.value == current.value){
                var temp = current.next;
                current.next = null;
                prev.next = temp;
                current = temp;
            }else {
                prev = prev.next;
                current = current.next;
            }
            //System.out.print(prev.value+" "+ current.value+"\n");
        }
    }
    void addAtRightSlot(int value){
                var node = new Node(value);
                Node i = head;
                if(isEmpty()){
                    addFirst(value);
                    return;
                }
                else if(node.value < i.value){
                    addFirst(value);
                    return;
                }
                while(i.next!=head){
                     if(node.value >= i.value && node.value <= i.next.value){
                        var temp = i.next;
                        node.next = temp;
                        i.next = node;
                        return;
                    }
                    i = i.next;
                }
                if(node.value > i.value){
                    addLast(value);
                }
    }
}
