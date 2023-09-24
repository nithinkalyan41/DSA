public class Main {
    public static void main(String[] args) {
            StackLinkedList<String> s = new StackLinkedList<>();
            s.push("andy");
            s.push("red");
            s.push("captain");
            s.push("norman");
        System.out.println(s);
        System.out.println(s.peek());
        System.out.println(s.pop());
        System.out.println(s);
    }
}