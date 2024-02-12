class SearchIn2D{
    public boolean searchMatrix(int[][] matrix, int target) {
        int s = 0;
        int e = matrix[0].length-1;
        while(s<matrix.length && e>-1){
            int temp = matrix[s][e];
            if (target == temp){
                return true;
            } else if (temp > target){
                e--;
            } else{
                s++;
            }
        }   
        return false;
    }
}
