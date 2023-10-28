import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       int n = sc.nextInt();
       int a[] = new int[n];
       int b[] = new int[n];
       for(int i=0;i<n;i++){
           a[i]=sc.nextInt();
       }
       for(int i=0;i<n;i++){
           b[i]=sc.nextInt();
       }
        System.out.println("O(n) Time and Space Complexity : " + duplicateContains(a,b,n));
        System.out.println("O(n^2) Time and Space Complexity : " + duplicateContain(a,b,n));
        System.out.println("O(nlogn) Time and Space Complexity : " + byUsingBinarySearch(a,b,n));
    }

    private static boolean duplicateContain(int[] a, int[] b, int n) {
        for(int i=0;i<n-1;i++){
            for(int j=i+1;j<n;j++){
                if(a[i]==a[j]){
                    return true;
                }
            }
        }
        return false;
    }

    static boolean duplicateContains(int a[],int b[],int n){
        Set<Integer> s = new HashSet<>();
        for(int x : b){
            s.add(x);
        }
        for(int x : a){
            if(s.contains(x))
                return true;
        }
        return false;
    }
    static boolean byUsingBinarySearch(int a[],int b[],int n){
        Arrays.sort(b);
        for(int i=0;i<n;i++){
            int start = 0;
            int end = n-1;
            while(start <= end){
                int mid = (start+end)/2;
                if(b[mid] == a[i])
                    return true;
                else if(b[mid] > a[i])
                    end = mid-1;
                else
                    start = mid+1;
            }
        }
       return false;
    }

}
