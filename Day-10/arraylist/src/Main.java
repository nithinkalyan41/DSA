import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Darray array = new Darray(2);
        array.insert(10);
        array.insert(20);
        array.insert(10);
        array.insert(40);
        array.insert(550);
        array.insert(10);
        array.insert(30);
        array.insert(250);
        array.insert(10);
        array.insert(40);
        array.insert(530);
        array.insert(10);
        array.print();
        //array.removeIfGreaterThan(20);
        System.out.println();
        //array.removeIfLessThan(40);
        array.removeIfEquals(10);
        System.out.println();
        array.print();
        System.out.println();
        System.out.println(array.max()+" "+array.min());
        int[] l = array.getItemsWithLength(3);
        System.out.println(Arrays.toString(l));
       array.ensureCapacity(400);


    }
}