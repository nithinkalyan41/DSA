class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
         Map<String, List<String>> m = new HashMap<>();
        for (String word : strs) {
            char[] c = word.toCharArray();
            Arrays.sort(c);
            String sortedWord = new String(c);
            if (!m.containsKey(sortedWord)) {
                m.put(sortedWord, new ArrayList<>());
            }
            m.get(sortedWord).add(word);
        }
        
        return new ArrayList<>(m.values());
    }
}
