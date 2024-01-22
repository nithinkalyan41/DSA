class MajorityElement {
    public int majorityElement(int[] nums) {
        int n = nums.length;
        Map<Integer,Integer> m = new HashMap<>();
        for(int i=0;i<n;i++){
                m.put(nums[i],m.getOrDefault(nums[i],0)+1);
        }
        int half = n/2;
       for(Map.Entry<Integer,Integer> e : m.entrySet()){
           if(e.getValue() > half){
               return e.getKey();
           }
       }
       return -1;
    }
}
