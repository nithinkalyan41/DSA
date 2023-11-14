import com.sun.security.jgss.GSSUtil;

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
    Node root;
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
    public void printPreOrder(Node root){
        if(root == null)
            return;
        System.out.print(root.data+" ");
        printPreOrder(root.left);
        printPreOrder(root.right);
    }
    public void printPostOrder(Node root){
        if(root == null)
            return;
        printPostOrder(root.left);
        printPostOrder(root.right);
        System.out.print(root.data+" ");
    }
    public void printInOrder(Node root){
        if(root == null)
            return;
        printInOrder(root.left);
        System.out.print(root.data+" ");
        printInOrder(root.right);
    }
    public int printMin(Node root){
        if(root.left == null)
            return root.data;
        return printMin(root.left);
    }
    public int printMax(Node root){
        if(root.right == null)
            return root.data;
        return printMax(root.right);
    }
    public int printHeight(Node root){
        if(root == null)
            return 0;
        return 1+Math.max(printHeight(root.left),printHeight(root.right));
    }
    private void nodeAtKDis(Node root,int distance){
        if(root==null)
            return;
        if(distance==0) {
            System.out.println(root.data);
            return;
        }
        nodeAtKDis(root.left,distance-1);
        nodeAtKDis(root.right,distance-1);
    }
    public void nodeAtKDis(int distance){
        nodeAtKDis(this.root,distance);
    }
    public boolean isBST(){
        return isBST(this.root,Integer.MIN_VALUE,Integer.MAX_VALUE);
    }
    private boolean isBST(Node root,int min,int max){
        if(root==null)
            return true;
        if(root.data < min || root.data > max)
            return false;

        return isBST(root.left,min,root.data-1) || isBST(root,root.data+1,max);
    }
    public void printSingles(Node root){
        if(root == null)
            return;
        if(root.left != null && root.right !=null){
            printSingles(root.left);
            printSingles(root.right);
        }else if(root.left !=null){
            System.out.println(root.left.data);
            printSingles(root.left);
        }else if (root.right !=null){
            System.out.println(root.right.data);
            printSingles(root.right);
        }
    }
}
