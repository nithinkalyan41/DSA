class ReverseWords{
    public String reverseWords(String s) {
       String[] words = s.trim().split("\\s+");
       String result = "";
       for(String word : words){
           result =" "+word+result;
       }
        return result.substring(1);
    }
}
