

import java.util.Arrays;

public class x{
    public static void main(String[] args) {
       
       System.out.println(Arrays.toString(a));
        int a[] ={1,2,4,4,4,7,8,15,45,45};
        int b[] = {-1,1,3,3,3,3,4,4,4,4,5,5,5,8,8,8,8};
        int n = a.length;
        int n1 = b.length;
        int c[] = new int[n+n1];
        int i=0;
        int j=0;
        int k=0;
        while(i<n && j<n1){
            if(a[i]<b[j]){
                c[k++]=a[i++];  
            }else{
                c[k++]=b[j++];
            }
        }
        while(i<n){
            c[k++]=a[i++];
        }
        while(j<n1){
            c[k++]=b[j++];
        }
        System.out.println(Arrays.toString(c));
       
        

    }
}
