import java.util.LinkedList;
public class Main {
    public static void main(String[] args) {
                HashTable table = new HashTable();
                 table.put(1,"andy");
                 table.put(10,"red");
                 table.put(220,"brooks");
                 table.put(12,"nothan");
                 table.put(5,"captain");
                System.out.println(table.remove(12));
    }
}
class HashTable{
    private class Entry{
        int key;
        String value;

        public Entry(int key, String value) {
            this.key = key;
            this.value = value;
        }
    }
    LinkedList<Entry>[] entries = new LinkedList[10];
    private int hash(int key){
        return key%entries.length;
    }
    public void put(int key,String value){
        int index = hash(key);
        if(entries[index]==null)
            entries[index]=new LinkedList<>();
        for(Entry entry : entries[index]){
            if(entry.key==key) {
                entry.value = value;
                return;
            }
        }
        var entry = new Entry(key,value);
        entries[index].add(entry);
    }
    public String get(int key){
        int index = hash(key);
        if(entries[index]!=null) {
            for (Entry entry : entries[index]) {
                if (entry.key == key) {
                    return entry.value;
                }
            }
        }
        return null;
    }
    public String remove(int key){
        int index = hash(key);
        if(entries[index]!=null) {
            for (Entry entry : entries[index]) {
                if (entry.key == key) {
                    String value = entry.value;
                    entries[index].remove(entry);
                    return value;
                }
            }
        }
        return null;
    }
}