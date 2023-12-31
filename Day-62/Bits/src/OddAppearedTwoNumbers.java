import java.util.Scanner;

public class OddAppearedTwoNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        int res = 0;
        for(int i=0;i<n;i++){
            res ^= a[i];
        }
        int c = 0;
        int mask = 1;
        while((res&1)!=1){
           mask<<=1;
        }

        int num1 = 0,num2=0;
        for(int i=0;i<n;i++){
            if((num1&mask) ==0){
                num1 ^=a[i];
            }else{
                num2 ^= a[i];
            }
        }
        System.out.println(num1+" "+num2);
    }
}

