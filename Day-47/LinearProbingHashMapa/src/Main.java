
import java.util.NoSuchElementException;
public class Main {
    public static void main(String[] args) {
        HashMap h = new HashMap(10);
        h.put(10,"bruce");
        h.put(20,"jack");
        h.put(10,"natasha");
        h.remove(20);
        h.put(20,"jack");
        h.print();

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

    private int linearProbingHash(int key) {
        int index = key % size;
        while (entries[index] != null) {
            if (entries[index].key == key) {
                return index;
            }
            index = (index + 1) % size;
        }
        return index;
    }

    public void put(int key, String value) {
        int index = linearProbingHash(key);
        entries[index] = new Entry(key, value);
    }
    public void remove(int key){
        int index = linearProbingHash(key);
        if(entries[index].key==0){
            throw  new NoSuchElementException();
        }else{
            entries[index]= new Entry(0,null);
        }
    }
     public boolean containsKey(int key){
        int index = linearProbingHash(key);
        if(entries[index] == null){
            return false;
        }
        return true;
    }
    public boolean containsValue(String value){
        for(Entry entry : entries){
            if(entry.value != null &&  entry.value.equals(value)){
                return true;
            }
        }
        return false;
    }

    void print(){
        for(var entry : entries){
            if(entry != null && entry.value != null) {
                System.out.println(entry.key + "=" + entry.value);
            }
        }
    }
}
