import java.util.Arrays;

public class PriorityQueueWithArray {
    int items[];
    int count;

    public PriorityQueueWithArray() {
        items =  new int[5];
    }

    public void enqueue(int item){
        if(isFull())
            throw  new IllegalStateException();
        int i =insertItemAtPosition(item);
        items[i]= item;
        count++;
    }

    @Override
    public String toString() {
        return ""+Arrays.toString(items);
    }
    public int size(){
        return count;
    }

    public int dequeue(){
        if(isEmpty())
            throw new IllegalStateException();
        var front = items[--count];
        items[count] = 0;
        return front;
    }

    private boolean isEmpty() {
        return  count == 0;
    }

    private int insertItemAtPosition(int item) {
        int i;
        for(i=count-1;i>=1;i--){
            if(items[i] > item) {
                items[i+1]=items[i];
            } else
                break;
        }
        return i+1;
    }


    private boolean isFull() {
        return count == items.length;
    }


}
