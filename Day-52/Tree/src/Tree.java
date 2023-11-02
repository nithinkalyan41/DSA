public class Tree {
    private class Node {
        private Node left;
        private int data;
        private Node right;
        public Node(int data) {
            this.data = data;
        }

        @Override
        public String toString() {
            return "Node{" +
                    "data=" + data +
                    '}';
        }
    }
    private Node root;
    public void insert(int data){
        if(root == null) {
            root = new Node(data);
            return;
        }
        var current = root;
        while(current!=null){
            if(current.data > data){
                if(current.left == null){
                    current.left = new Node(data);
                    return;
                }
                  current = current.left;
            }else{
                if(current.right == null){
                    current.right = new Node(data);
                    return;
                }
                current = current.right;
            }
        }
    }
    public boolean find(int data){
        var current = root;
        while(current!=null){
            if(current.data > data){
                current = current.left;
            }else if(current.data < data){
                current = current.right;
            }else{
                return true;
            }
        }
        return false;
    }
}
