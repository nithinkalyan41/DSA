import java.util.Arrays;
import java.util.Scanner;

public class removeSortedArray {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[]  nums = new int[n];
    for(int i=0;i<n;i++){
      nums[i] = sc.nextInt();
    }
    int k = removeDuplicates(nums);
    System.out.println(Arrays.toString(Arrays.copyOfRange(nums, 0, k )));
  }
  public  static int removeDuplicates(int[] nums) {
    int index = 1;
    for (int i=1;i<nums.length;i++) {
        if (nums[i] != nums[i-1]) {
            nums[index++] = nums[i];
        }
    }
    return index;

}
}

