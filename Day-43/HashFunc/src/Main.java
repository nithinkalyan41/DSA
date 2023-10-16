

public class Main {
    public static void main(String[] args) {
      Hash s = new Hash();
      s.add(9);
    }
}
class Hash{
    int[] items = new int[10];
    void add(int data){
        int index = hash(data);
        items[index]=data;
    }
    private int hash(int data){
        return data;
    }

}