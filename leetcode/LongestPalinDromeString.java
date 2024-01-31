class LongestPalinDromeString{
	    public String longestPalindrome(String s) {
        int start=0,end=0;
        for(int i=0;i<s.length();i++){
            int o = expand(s,i,i);
            int e = expand(s,i,i+1);
            int max = Math.max(o,e);
            if(max > end-start+1){
                start = i -(max-1)/2;
                end = i+max/2;
            }
           
        }
         return s.substring(start,end+1);

    }
    static int expand(String s,int l,int r){
        while(l>=0 && r<s.length() && s.charAt(l)==s.charAt(r)){
            l--;
            r++;
        }
        return r-l-1;
    }
}
