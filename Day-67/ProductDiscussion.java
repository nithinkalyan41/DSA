import java.util.Arrays;
import java.util.Scanner;

public class ProductDiscussion {
    static int solve(int[] a, int n, int k) {
        if (n == 1)
            return 0;

        Arrays.sort(a);
        int small = a[0] + k;
        int large = a[n - 1] - k;
        int ans = Math.abs(a[n - 1] - a[0]);

        if (small > large) {
            int temp = small;
            small = large;
            large = temp;
        }

        for (int i = 1; i < n - 1; i++) {
            int newSmall = a[i] - k;
            int newLarge = a[i] + k;
              //System.out.println(newSmall+" "+newLarge);//+" "+small+" "+large);    
            if (newSmall >= small || newLarge <= large)
                continue;
            if(newSmall<small && large < newLarge)
                small = newSmall;
            else
                large = newLarge;

       
        }
        

        ans = Math.min(ans, Math.abs(large - small));
        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int k = sc.nextInt();

        int[] arr = new int[n];
        for (int i=0;i<n;i++)
            arr[i] = sc.nextInt();

        System.out.println(solve(arr, n, k));
    }
}
