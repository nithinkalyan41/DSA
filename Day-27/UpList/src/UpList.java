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
    void add(int data){
       if(head == null){
           head = new Node(data);
           return;
       }
       var current = head;
       while (current != null){
           if(current.data > data){
               if(current.up == null){
                   current.up = new Node(data);
                   return;
               }
               current = current.up;
           }else{
               if(current.next == null){
                   current.next = new Node(data);
                   return;
               }
               current = current.next;
           }
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
    String search(int data){
       if(head == null){
           head = new Node(data);
       }
       var current = head;
       while(current != null){
           if(current.data == data)
               return "ElementFound";
           if(data < current.data){
               current = current.up;
           }else{
               current = current.next;
           }
       }
       return "Element not exist";
    }
    void minElement(Node current){
       if(current.up == null){
           System.out.println(current.data);
           return;
       }
       minElement(current.up);
    }
    void maxElement(Node node){
       if(node.next == null) {
           System.out.println(node.data);
           return;
       }
       maxElement(node.next);
    }
}
