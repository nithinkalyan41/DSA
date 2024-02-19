class WordPattern
{
    public boolean wordPattern(String pattern, String s) {
        String words[] = s.split(" ");
        if(words.length != pattern.length()) return false;
        Map<Character,String> m = new HashMap<>();
        for(int i=0;i<pattern.length();i++){
            char c = pattern.charAt(i);
            if(m.containsKey(c)){
                if(!m.get(c).equals(words[i])){
                    return false;
                }
            }else{
                if(m.containsValue(words[i])){
                    return false;
                }
                m.put(c,words[i]);
            }
        }
        return true;
    }
}
