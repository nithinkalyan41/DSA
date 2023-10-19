import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Hash s = new Hash();
        s.add(50);
        s.add(70);
        s.add(76);
        s.add(93);
        s.add(64);
       // s.add(45);
        System.out.println(s);
    }


}
class Hash{
    int[] items = new int[5];
    void add(int data){
        int index = linearProbing(data);
        items[index]=data;
    }
    private int linearProbing(int data){
        int index = data%items.length;
        while(items[index]!=0){
            index = (index + 1) % items.length;
        }
        return index;
    }
    private int quadraticProbing(int data){
        int index = data%items.length;

        int i=1;
        while(items[index]!=0){
            index = (index + i*i) % items.length;
        }
        return index;
    }


    @Override
    public String toString() {
        return ""+ Arrays.toString(items)+"";
    }
}