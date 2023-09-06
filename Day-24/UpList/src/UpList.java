public class UpList {
    private class Node {
        Node up;
        int data;
        Node next;
        Node(int data){
            this.data = data;
        }
    }
    Node head;
   void addNext(int value){
       var node = new Node(value);
       if(head == null)
           head = node;
       else {
           var current = head;
           while (current.next != null)
               current = current.next;
           current.next = node;
       }
   }
    void addUp(int value){
        var node = new Node(value);
        if(head == null)
            head = node;
        else {
            var current = head;
            while (current.up != null)
                current = current.up;
            current.up = node;
        }
    }
    void printNext(){
       var current = head;
       while(current != null){
           System.out.print(current.data+" ");
           current = current.next;
       }
    }
    void printUp(){
        var current = head;
        while(current != null){
            System.out.print(current.data+" ");
            current = current.up;
        }
    }

}
