 class Node{
    int data;
    Node next;
    Node(int data){
        this.data = data;
    }
}
public class SinglyLinkedList {
    Node head;
    int size;

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
    Node segregate(Node head) {
        Node evenStart = null,oddStart = null,evenEnd = null,oddEnd = null;
        for(Node current= head;current!=null;current=current.next){
            var x = current.data;
            if(x%2 == 0){
                if(evenStart == null) {
                    evenStart = current;
                    evenEnd = evenStart;
                }else {
                    evenEnd.next = current;
                    evenEnd = current;
                }
            }else{
                if(oddStart == null) {
                    oddStart = current;
                    oddEnd = oddStart;
                }else {
                    oddEnd.next = current;
                    oddEnd = current;
                }
            }
        }
        if(evenStart==null || oddStart==null)
            return head;
        evenEnd.next = oddStart;
        oddEnd = null;
        return evenStart;
    }

/*    void revKNodesKTimes(int k){
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
        }*/
//    }
}
