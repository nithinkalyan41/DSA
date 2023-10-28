import java.util.*;
public class twosum{
   public static void main(String args[]){
   	int a[] = {1,2,3,4,5,6,8,4,5};
   	int target = 5;
    HashMap<Integer, Integer> m = new HashMap<Integer, Integer>();
    for (int i = 0; i < a.length; i++) {
        m.put(a[i], i);
    }
    for (int i = 0; i < a.length; i++) {
        int t = target - a[i];
        if (m.containsKey(t) && m.get(t) != i) {
            System.out.println(i+" "+m.get(t));
            break;
        }
    }
}
}    
