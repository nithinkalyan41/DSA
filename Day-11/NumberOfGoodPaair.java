class NumberOfGoodPairs{
    public int numIdenticalPairs(int[] nums) {
       Map<Integer,Integer> h = new HashMap<>();
       int c = 0;
        for(int i: nums){
            if(h.containsKey(i)){
                c += h.get(i);
                h.put(i,h.get(i)+1);
            }
            else{
                 h.put(i,1);
            }
        }
        return c;

    }
}
