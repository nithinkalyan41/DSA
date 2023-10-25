
import java.util.NoSuchElementException;
public class Main {
    public static void main(String[] args) {
        HashMap h = new HashMap(7);
        h.put(50,"bruce");
        h.put(700,"jack");
        h.put(76,"natasha");
        h.put(85,"ROG");
        h.print();
        System.out.println();
        h.remove(700);
//        h.put(20,"jack");
        h.print();
        System.out.println(h.containsValue("jack"));
    }
}
class HashMap {
    private class Entry {
        int key;
        String value;

        public Entry(int key, String value) {
            this.key = key;
            this.value = value;
        }
    }

    int size;
    Entry[] entries;
    public HashMap(int size) {
        this.size = size;
        entries = new Entry[size];
    }

    private int quadraticProbingHash(int key) {
        int index = key % size;
        for(int i = 0 ; entries[index] != null;i++) {
            if (entries[index].key == key) {
                return index;
            }
            index = (index + i*i) % size;
        }
        return index;
    }

    public void put(int key, String value) {
        int index = quadraticProbingHash(key);
        entries[index] = new Entry(key, value);
    }
    public void remove(int key){
        int index = quadraticProbingHash(key);
        if(entries[index].key==0){
            throw  new NoSuchElementException();
        }else{
            entries[index]= new Entry(0,null);
        }
    }
    public boolean containsKey(int key){
        int index = quadraticProbingHash(key);
        if(entries[index] == null){
            return false;
        }
        return true;
    }
    public boolean containsValue(String value){
        for(Entry entry : entries){
            if(entry != null && entry.value!=null &&  entry.value.equals(value)){
                return true;
            }
        }
        return false;
    }

    public void print(){
        for(var entry : entries){
            if(entry != null && entry.value != null) {
                System.out.println(entry.key + "=" + entry.value);
            }
        }
    }
}
