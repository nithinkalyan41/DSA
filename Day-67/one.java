import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class one{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = Integer.parseInt(scanner.nextLine());
        String s = scanner.nextLine();
        int q = Integer.parseInt(scanner.nextLine());

        int[][] queries = new int[q][2];
        char[] characters = new char[q];

        for (int i = 0; i < q; i++) {
            String[] queryStr = scanner.nextLine().split(" ");
            queries[i][0] = Integer.parseInt(queryStr[0]);
            queries[i][1] = Integer.parseInt(queryStr[1]);
        }

        String[] charStr = scanner.nextLine().split(" ");
        for (int i = 0; i < q; i++) {
            characters[i] = charStr[i].charAt(0);
        }

        List<Integer> result = solve(N, s, q, queries, characters);

        for (int res : result) {
            System.out.print(res + " ");
        }
    }
 

 public static List<Integer> solve(int N, String s, int q, int[][] queries, char[] characters) {
         List<Integer> ans = new ArrayList<>();
        for(int i=0;i<q;i++){
            int st = queries[i][0]-1;
            int lt = queries[i][1];
            char c = characters[i];
            int l = lt-st;
            int count = 0;
            for(int j=0;j<lt;j++){
                if(s.charAt(st+j)==c && j+1 < lt && s.charAt(st-j+1)=='c'){
                        count++;
                        j++;
                }
            }
            ans.add(lt-count);
            return ans;

        }






        // for (int i = 0; i < q; i++) {
        //     int left = queries[i][0] - 1;
        //     int right = queries[i][1] - 1;
        //     char x = characters[i];
        //     ans[i] = getMinLength(s, left, right, x);
        // }

        return ans;
    }

    private static int getMinLength(String s, int left, int right, char x) {
        StringBuilder sb = new StringBuilder(s.substring(left, right + 1));
        boolean changed = true;

        while (changed) {
            changed = false;
            for (int i = 0; i < sb.length() - 1; i++) {
                if (sb.charAt(i) == x && sb.charAt(i + 1) == x) {
                    sb.delete(i, i + 2);
                    changed = true;
                    break;
                }
            }
        }

        return sb.length();
    }
}
