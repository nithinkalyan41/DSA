class FindIndexes {
    public int[] searchRange(int[] nums, int target) {
        int leftMost = binarySearch(nums,target,true);
        int rightMost = binarySearch(nums,target,false);
        return new int[]{leftMost,rightMost};
        
    }
    public static int binarySearch(int[] nums,int target,boolean leftSide){
        int s = 0, e = nums.length-1, idx = -1; 
        while(s<=e){
            int m = (s+e)/2;
            if(nums[m]==target){
                idx = m;
                if(leftSide)
                    e = m - 1;
                else
                    s = m + 1;
            }else if(nums[m]>target){
                e = m - 1;
            }else{
                s = m + 1;
            }
        }
        return idx;
    }
}
