import java.util.Scanner;

public class TurnOffIthBit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i = sc.nextInt();
        if(i>32){
            throw new IndexOutOfBoundsException("enter valid index");
        }else{
            int mask = 1<<i;
            int res = n&(~mask);
            System.out.println(res);
        }



    }
}
