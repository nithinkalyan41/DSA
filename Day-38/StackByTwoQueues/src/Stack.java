import java.util.ArrayDeque;
import java.util.Queue;

public class Stack {
    private Queue<Integer> q1 = new ArrayDeque<>();
    private Queue<Integer> q2 = new ArrayDeque<>();
    int top;
    public void push(int data){
       /* while(!q1.isEmpty()){
            q2.add(q1.remove());
        }
        q1.add(data);
        while(!q2.isEmpty()){
            q1.add(q2.remove());
        }*/
        q1.add(data);
        top = data;
    }
    public int pop(){
        if(q1.isEmpty())
            throw new IllegalStateException();
        int tempSize = size();
        for(int i =0;i<tempSize-1;i++){
            top= q1.remove();
            q2.add(top);
            //System.out.println(q1.size());
        }
        swap();
        return q2.remove();
    }
    public int peek(){
        return top;
    }
    public int size(){
        return q1.size();
    }

    private void swap() {
        var temp = q1;
        q1 = q2;
        q2 = temp;
    }

    @Override
    public String toString(){
        return q1.toString();
    }

}
