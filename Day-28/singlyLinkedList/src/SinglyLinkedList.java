public class SinglyLinkedList {
    Node head;
    int size;
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
            size++;
            return;
        }
        if(node.next == null){
            node.next = new Node(data);
            size++;
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
        if(k>size){
            throw new IndexOutOfBoundsException();
        }
        var prev = head;
        var current = head.next;
        var next = current.next;
        int c = 1;
        while(c < k){
            current.next = prev;
            prev = current;
            current = next;
            if(current != null)
                next = current.next;
            c++;
        }
        head.next = current;
        head = prev;
    }
    void revKNodesKTimes(int k){
        if(head == null)
            throw new IllegalStateException();
        if(head.next == null)
            System.out.println(head.data);
        var prev = head;
        var current = head.next;
        var next = current.next;
        for(int i=1;i<=size;i+=k){
            int c = 1;
            var temp = prev;
            while(c<k){
                current.next = prev;
                prev = current;
                current = next;
                if(current!=null)
                    next = current.next;
                c++;
            }
            if(i==1){
                head.next = current;
                head = prev;
            }else {
                prev.next = current;
                prev = current;
                current = next;
            }
//            if(current != null)
//                next = current.next;
        }
    }
}
