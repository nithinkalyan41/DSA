import java.util.ArrayDeque;
import java.util.Deque;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
                int a[] = {12,11,9,15,20,19,25};
                slidingWindow(a,3);
    }
    static void slidingWindow(int a[],int k){
        Deque<Integer> q = new ArrayDeque<>();
        for(int i=0;i<k;i++){
            while(q.size()>0 && a[i] >= a[q.peekLast()]){
                q.pollLast();
            }
            q.offerLast(i);
        }
        for(int i=k;i<a.length;i++){
            System.out.println(a[q.peekFirst()]);
            while(q.size()>0 && q.peekFirst() <= i-k){
                q.pollFirst();
            }
            while(q.size()>0 &&a[i] >= a[q.peekLast()]){
                q.pollLast();
            }
            q.offerLast(i);
        }
        System.out.println(a[q.peekLast()]);
    }
}