public class ReverseBits{
    // you need treat n as an unsigned value
    public int reverseBits(int n) {
         boolean b = false;
        if(n<0){
            b=true;
        }
        int res = 0;
        int l = 31;
        while(l-->0){
            res |= (n&1);
            n = n>>1;
            res = res<<1;
        }
        return b ? res+1 : res;
    }
}
