// Java program to rotate a
// matrix by 90 degrees
import java.io.*;

class rotate {
	// An Inplace function to
	// rotate a N x N matrix
	// by 90 degrees in
	// anti-clockwise direction
	static void rotateMatrix(int n, int mat[][])
	{
          for(int i=0;i<n/2;i++){
            for(int j=i;j<n-1-i;j++){
                int temp = mat[i][j];
                mat[i][j] = mat[j][n-i-1];
                mat[j][n-i-1] = mat[n-i-1][n-j-1];
                mat[n-i-1][n-j-1] = mat[n-j-1][i];
                mat[n-j-1][i] = temp;
            }
          }
	}

	// Function to print the matrix
	static void displayMatrix(int N, int mat[][])
	{
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++)
				System.out.print(" " + mat[i][j]);

			System.out.print("\n");
		}
		System.out.print("\n");
	}

	/* Driver code*/
	public static void main(String[] args)
	{
		int N = 4;

		int mat[][] = { { 1, 2, 3, 4 },
						{ 5, 6, 7, 8 },
						{ 9, 10, 11, 12 },
						{ 13, 14, 15, 16 } };

		// Function call
		rotateMatrix(N, mat);

		// Print rotated matrix
		displayMatrix(N, mat);
	}
}

// This code is contributed by Prakriti Gupta
