import java.lang.reflect.Array;
import java.util.Arrays;

public class subarray {
    public static void main(String[] args) {
        int[] arr = {5,-1,3,-1,4,5,3,-1,8};
        interChange(arr);
        int[] a = {3,7,0,4,0,6,0,8,0,3};
        movingZeros(a);
        int[] fun={5,12,13,14,9,2,3,4,5,8,9,5};
        consecutive(fun);
        //System.out.println(Arrays.toString(fun));
    }

    private static void consecutive(int[] fun) {
        for(int i=1;i<fun.length;i++){
            if(fun[i-1]==fun[i]-1){
                System.out.print(fun[i-1]+" ");
            }else{
                System.out.println(fun[i-1]);
            }
        }
        System.out.println(fun[fun.length-1]);
    }

    private static void printSubArraySum(int[] arr) {
        for(int i=1;i<=arr.length;i++){
            for(int j =0;j<= arr.length-i ;j++){
                int sum = 0;
                for(int k = j; k<(j+i) ;k++){
                    sum+=arr[k];
                }
                System.out.println(sum);
            }
        }
    }
    private static void printSubArrayOfSum(int[] arr,int given) {
        for(int i=1;i<=arr.length;i++){
            for(int j =0;j<= arr.length-i;j++){
                int sum = 0;
                for(int k = j; k<(j+i) ;k++){
                    sum+=arr[k];
                }
                if(sum==given){
                    for(int k = j; k<(j+i) ;k++){
                        System.out.print(arr[k]+" ");
                    }
                    System.out.println();
                }
            }
        }
    }
    private static void interChange(int[] a){
        int i = a.length-1;
        int j = a.length-1;
        while(i>=0){
            if(a[i]==-1){
                i--;
            }else{
                a[j--]=a[i--];
            }
        }
        while(j>=0){
            a[j--]=-1;
        }
    }
    static void movingZeros(int[] a){
        int i=0,j=0;
        while(i<a.length){
            if(a[i]==0){
                i++;
            }else{
                a[j++]=a[i++];
            }
        }
        while(j<a.length){
            a[j++]=0;
        }
    }
}
