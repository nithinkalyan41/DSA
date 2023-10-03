import java.util.Arrays;

public class Queue {
    int[] items;
    int front;
    int rear;
    int count;

    public Queue(){
        this(6);
    }
    public Queue(int size){
        items = new int[size];
    }
    public void enqueue(int value){
        if(isFull())
            throw new IllegalStateException();
        items[rear]=value;
        rear = (rear+1)%items.length;
        count++;

    }
    public int dequeue(){
        var frontEle = items[front];
        items[front]=0;
        front = (front+1)% items.length;
        count--;
        return frontEle;
    }
    public int peek(){
        return items[front];
    }
    public boolean isFull(){
        return count==items.length;
    }
    public boolean isEmpty(){
        return count==0;
    }
    public int size(){
        return items.length;
    }
    @Override
    public String toString() {
        return Arrays.toString(items);
    }
}
