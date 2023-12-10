public class Maximum {
    public static void main(String[] args) {
        int n = 8456;

        int x = n;
        int min = Integer.MAX_VALUE;
        while(x>0){
            if(x%10<min){
                min = x%10;
            }
            x /=10;
        }
        int rev = 0;
        
        while (n>0) {
            int temp = n%10;
            if(temp!=min){
                rev = rev*10+temp;
            }
            n /= 10;
        }

        int res = 0;
        while(rev>0){
            res = res*10 + (rev%10);
            rev /=10;
        }

        System.out.println(res);
    }
}
