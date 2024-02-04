class Container{
    public int maxArea(int[] height) {
         int water = 0;
            int  start = 0;
            int end = height.length-1;
            while(start<end){
                int min = Math.min(height[start],height[end])*(end-start);
                water = Math.max(water,min);
                if(height[start] > height[end]){
                    end--;
                }else{
                    start++;
                }
            }
            return water;
    }
}
