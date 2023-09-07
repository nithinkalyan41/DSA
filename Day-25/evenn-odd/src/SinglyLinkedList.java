public class SinglyLinkedList {
     class Node {
        int data;
        Node next;
        Node(int data){
            this.data = data;
        }
    }
    Node head;
    void addLast(int data){
        var node = new Node(data);
        if(head == null){
            head = node;
        }else{
            var current = head;
            while(current.next!=null){
                current = current.next;
            }
            current.next = node;

        }
    }
    void OddFirstEvenNext(){
        if(head ==null)
            throw new IllegalStateException();
      Node odd = head;
      Node even = head.next;
      Node evenHead = even;
      while(even != null && even.next != null){
          odd.next = odd.next.next;
          odd = odd.next;
          even.next = even.next.next;
          even = even.next;
      }
      odd.next = evenHead;
    }


    void print(){
        var current = head;
        while(current!=null){
            System.out.print(current.data+" ");
            current = current.next;
        }
    }
}
