class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        int a[] = new int[2];
       Map<Integer,Integer> h = new HashMap<>();
       for(int i=0;i<nums.length;i++){
           int diff = target - nums[i];
           if(h.containsKey(diff)){
                a[0]= h.get(diff);
                a[1]=i;
           }
            h.put(nums[i],i);    
       }
       return a;
    }
}
