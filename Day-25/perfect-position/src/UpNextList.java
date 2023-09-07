public class UpNextList {
    private class Node{
        Node up;
        int data;
        Node next;
        Node(int data){
            this.data = data;
        }
    }
    Node head;
    void addNext(int data){
        Node node = new Node(data);
        if(isEmpty()){
            head = node;
        }else{
            Node current = head;
            while(current.next!=null){
                current = current.next;
            }
            current.next = node;
        }
    }
    void addUp(int data){
        Node node = new Node(data);
        if(isEmpty()){
            head = node;
        }else{
            Node current = head;
            while(current.up!=null){
                current = current.up;
            }
            current.up = node;
        }
    }
    void addUpAtPosition(Node node){
            Node current = head;
            while(current.up!=null){
                if(node.data > current.up.data)
                    break;
                current = current.up;
            }
            var temp = current.up;
             node.up = temp;
            current.up = node;

    }
    void addNextAtPosition(Node node){
        Node current = head;
        while(current.next != null){
            if(node.data < current.next.data)
                break;
            current = current.next;
        }
        var temp = current.next;
        current.next = node;
        node.next = temp;
    }
    void addAtPosition(int data){
        Node node = new Node(data);
        if(isEmpty()){
            head = node;
        }else if(node.data < head.data){
            addUpAtPosition(node);
        }else{
            addNextAtPosition(node);
        }
    }
    private boolean isEmpty(){
        return head==null;
    }
    void printUp(){
        var current = head;
        while(current!=null){
            System.out.print(current.data+" ");
            current = current.up;
        }
    }
    void printNext(){
        var current = head;
        while(current != null){
            System.out.print(current.data+" ");
            current = current.next;
        }
    }
}
