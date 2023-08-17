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
    void replaceAt(int place,int value){
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
    int size(){
        return index;
    }
    void print(){
        for(int i=0;i<index;i++){
            System.out.print(elements[i]+" ");
        }
    }
}
