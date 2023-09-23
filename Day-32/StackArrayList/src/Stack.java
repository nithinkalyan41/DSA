import java.util.ArrayList;
import java.util.EmptyStackException;


public class Stack<T> {
    private ArrayList<T> arrayList;
    Stack(){
        arrayList = new ArrayList<>();
    }
   public  void push(T value){
        arrayList.add(value);
    }
    public T pop(){
        if(isEmpty())
            throw new EmptyStackException();
        var x = arrayList.get(size()-1);
        arrayList.remove(x);
        return x;
    }
    public T peek(){
        if(isEmpty())
            throw new EmptyStackException();
        return arrayList.get(size()-1);
    }
    public int size(){
        return arrayList.size();
    }
    public boolean isEmpty(){
        return arrayList.isEmpty();
    }

    @Override
    public String toString() {
        return ""+ arrayList +"";
    }
}
