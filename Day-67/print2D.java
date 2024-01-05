import java.util.Scanner;

public class print2D {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int rows = sc.nextInt();
    int cols = sc.nextInt();
    int a[][] = new int[rows][cols];
    for(int i=0;i<rows;i++){
      for(int j=0;j<cols;j++){
        a[i][j] = sc.nextInt();
      }
    }
    print(a);
  }

  private static void print(int[][] a) {
    for(int i=0;i<a.length;i++){
      for(int k=0;k<a.length-i;k++){
        for(int j=0;j<a[0].length;j++){
          System.out.print(a[i][j]+" ");
        }
        System.out.println();
      }
    }
  }
}
