import java.util.Arrays;
import java.util.EmptyStackException;

public class Stack {
    private int items[];
    private int top1;
    private int top2;
    private int size;
    Stack(){
        this(6);
    }
    public Stack(int size){
        this.size = size;
        items = new int[size];
        top1 = -1;
        top2 = size;
    }
    void push1(int value){
        if(isFull())
            throw new StackOverflowError();
        items[++top1] = value;
    }
    void push2(int value){
        if(isFull())
            throw new StackOverflowError();
        items[--top2] = value;
    }
    int pop1(){
        if(isEmpty())
            throw new EmptyStackException();
        return items[top1--];
    }
    int pop2(){
        if(isEmpty())
            throw new EmptyStackException();
        return items[top2++];
    }
    private boolean isFull(){
        return top1 == top2-1;
    }
    private boolean isEmpty(){
        return top1==-1 && top2==size;
    }

    @Override
    public String toString() {
        var stack1 = Arrays.copyOfRange(items,0,top1+1);
        var stack2 = Arrays.copyOfRange(items,top2,size);
        return Arrays.toString(stack1)+" "+Arrays.toString(stack2);
    }
}
