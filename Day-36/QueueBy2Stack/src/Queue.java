import java.util.ArrayList;
import java.util.Stack;

public class Queue {
    private Stack<Integer> s1 = new Stack<>();
    private Stack<Integer> s2 = new Stack<>();
    public void enqueue(int value){
        s1.push(value);
    }
    public int dequeue(){
        if(isEmpty())
            throw new IllegalStateException();
        moveTostack2();
        return s2.pop();
    }
    public int peek(){
        if(isEmpty())
            throw new IllegalStateException();
        moveTostack2();
        return s2.peek();
    }

    private void moveTostack2() {
        if(s2.isEmpty()){
            while (!s1.isEmpty()){
                s2.push(s1.pop());
            }
        }
    }

    private boolean isEmpty(){
        return s1.isEmpty()&&s2.isEmpty();
    }

/*    @Override
    public String toString() {
        Stack<Integer> s3 = (Stack<Integer>) s2.clone();
        Stack<Integer> s4 = (Stack<Integer>) s1.clone();
        ArrayList<Integer> a = new ArrayList<>();
        while(!s3.isEmpty())
            a.add(s3.pop());
        while(!s4.isEmpty())
            a.add(s4.pop());
        return ""+a+"";
    }*/
}
