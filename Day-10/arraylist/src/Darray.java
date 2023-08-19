import java.util.Arrays;

public class Darray {

    private int elements[];
    private int index = 0;
    Darray(int size){
        elements = new int[size];
    }
    void insert(int value){
        if(elements.length == index){
            int[] temparray = new int[index * 2];
            for(int i=0;i<index;i++){
                temparray[i]=elements[i];
            }
            elements = temparray;
        }
        elements[index] = value;
        index++;
    }
    void set(int place,int value){
        if(place < 0 || place >= index){
            throw new IndexOutOfBoundsException();
        }
        elements[place]=value;
    }
    void removeAt(int place){
        if(place < 0 || place >= index){
            throw new IllegalArgumentException();
        }
        for(int i=place;i<index;i++){
            elements[i]=elements[i+1];
        }
    }
    int indexOf(int value){
        for(int i=0;i<index;i++){
            if(elements[i]==value)
                return i;
        }
        return -1;
    }
    int firstIndexOf(int value){
        for(int i=0;i<index;i++){
            if(elements[i]==value)
                return i;
        }
        return -1;
    }
    int lastIndexOf(int value){
        for(int i=index;i>-1;i--){
            if(elements[i]==value)
                return i;
        }
        return -1;
    }
    boolean contains(int value){
        for(int i=0;i<index;i++)
            if(elements[i]==value) return true;
        return false;
    }
    boolean isEmpty(){
        return index==0;
    }

    void subList(int start,int end){
        if(start<0 || start>=index)
            throw new IllegalArgumentException();
        else if(!(end>=start && end<=index))
            throw new IllegalArgumentException();
        if(start == end) {
            System.out.println("[]");
            return;
        }
        int tarray[] = new int[end-start];
        for(int i=start,j=0;i<end;i++)
            tarray[j++]=elements[i];
        System.out.println(Arrays.toString(tarray));
    }
    int x = 0;
    boolean hasnext(){
        return x!=index;
    }
    int next(){
        return elements[x++];
    }
    void clear(){
        index = 0;
    }
    int size(){
        return index;
    }
    void print(){
        for(int i=0;i<index;i++){
            System.out.print(elements[i]+" ");
        }
    }
    @Override
    public String toString() {
        int temp[] = Arrays.copyOf(elements,index);
        return Arrays.toString(temp);
    }
    void removeIfGreaterThan(int value){
        int[] temp = new int[elements.length];
        int j = 0;
        for(int i=0;i<index;i++){
            if(!(elements[i]>value)){
                temp[j]=elements[i];
                j++;
            }
        }
        elements = temp;
        index = j;
    }
    void removeIfLessThan(int value){
        int[] temp = new int[elements.length];
        int j=0;
        for(int i=0;i<index;i++){
            if(!(elements[i]<value)){
                temp[j]=elements[i];
                j++;
            }
        }
        elements = temp;
        index = j;
    }
    void removeIfEquals(int value){
        int[] temp = new int[elements.length];
        int j=0;
        for(int i=0;i<index;i++){
            if(elements[i]!=value){
                temp[j] = elements[i];
                j++;
            }
        }
        index=j;
        elements=temp;
    }
    int max(){
        int max = 0;
        for(int i=0;i<index;i++){
            if(elements[i]>max){
                max=elements[i];
            }
        }
        return max;
    }
    int min(){
        int min = Integer.MAX_VALUE;
        for(int i=0;i<index;i++){
            if(elements[i]<min){
                min=elements[i];
            }
        }
        return min;
    }
    int[] getItemsWithLength(int length){
        int[] temp = new int[index];
        int j =0;
        for(int i=0;i<index;i++){
            int element = elements[i];
            int count = 0;
            while(element>0){
                element = element/10;
                count++;
            }
            if(count==length){
                temp[j]=elements[i];
                j++;
            }
        }
        return temp;
    }
    void ensureCapacity(int value){
        int length = elements.length;
        while(length<=value){
            length = length * 2;
        }
        int[] temp = new int[length];
        for(int i=0; i<index; i++){
            temp[i] = elements[i];
        }
        elements = temp;
        System.out.println(elements.length);
    }
    
}