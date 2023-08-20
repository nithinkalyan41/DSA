import java.util.Arrays;

public class MovingZeros{
    public static void main(String[] args) {
        int a[] = {1,1,0,2,0,5,0,5,5,0,4,122,0,4,22,0};
        int ans[] = new int[a.length];
       for(int i=0,j=0;i<a.length;i++){
               if(a[i]>0){
                ans[j]=a[i];
                j++;
               }
       }
       System.out.println(Arrays.toString(ans));
    }
}

