import java.util.Scanner;

public class twoD{
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter Rows Size : ");
    int rows = sc.nextInt();
    System.out.println("Enter Columns Size");
    int columns = sc.nextInt();
    int a[][] = new int[rows][columns];
    System.out.println("Enter elements in array : ");
    for(int row=0;row<rows;row++){
        for(int col=0;col<columns;col++){
          a[row][col] = sc.nextInt();
        }
    }
    print(a);
  }
  static void print(int[][] a){
    for(int i=0;i<a.length;i++){
      for(int j=0;j<a[0].length;j++){
        System.out.print(a[i][j]+" ");
      }
      System.out.println();
    }
  }
  
}