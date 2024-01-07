public class rotate2 {
  static void rotateMatrix(int[][] mat) {
    int n = mat.length;
    int m = mat[0].length;
    int[][] newMat = new int[m][n];
   
    for (int i = 0; i < n; i++) {
        for (int j = 0; j < m; j++) {
            newMat[n-j-1][i] = mat[i][j];
        }
        System.out.println("hi");
        
        //break;
    // }
    // for (int i = 0; i < n; i++) {
    //     for (int j = 0; j < m; j++) {
    //         mat[i][j] = newMat[i][j];
    //     }
    //     //System.out.println();
    // }
    // Copy the rotated matrix back to the original matrix
 
    }
    
}

// Function to print the matrix
static void displayMatrix(int[][] mat) {
    int n = mat.length;
    int m = mat[0].length;
    for (int i = 0; i < n; i++) {
        for (int j = 0; j < m; j++) {
            System.out.print(mat[i][j] + " ");
        }
        System.out.println();
    }
}

public static void main(String[] args) {
    // Test Case 1
    int[][] mat = {
        {1, 2, 3},
        {5, 6, 7},
        {9, 10, 11}
    };

    // Function call to rotate the matrix
    rotateMatrix(mat);

    // Print the rotated matrix
    displayMatrix(mat);
}


}
