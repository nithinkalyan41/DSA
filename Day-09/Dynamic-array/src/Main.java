
public class Main {
    public static void main(String[] args) {
      Darray array = new Darray(2);
      array.insert(10);
      array.insert(20);
      array.insert(10);
      array.insert(40);
      array.insert(50);
      array.insert(10);
      array.print();
        System.out.println();
      array.replaceAt(0,40);
      array.print();
        System.out.println();
        System.out.println(array.indexOf(40));
        System.out.println(array.firstIndexOf(10));
        System.out.println(array.lastIndexOf(10));
        System.out.println(array.size());
        System.out.println(array.contains(60));
      array.clear();
      System.out.println(array);
      array.subList(0,3);
      System.out.println();
      while(array.hasnext()){
        System.out.print(array.next()+" ");
      }

    }
}