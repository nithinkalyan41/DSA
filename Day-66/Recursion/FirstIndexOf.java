import java.util.*;

public class FirstIndexOf {
    public static void main(String[] args) {
        List<List<Integer>> l = new ArrayList<>(
            Arrays.asList(
                Arrays.asList(1, 2, 3),
                Arrays.asList(3, 2, 1),
                Arrays.asList(2, 1, 3),
                Arrays.asList(3, 1, 2)
            )
        );

        // Sorting the list of lists lexicographically
        l.sort(new LexicographicalComparator());

        // Printing the sorted list of lists
        for (List<Integer> innerList : l) {
            System.out.println(innerList);
        }
    }

    // Custom comparator for lexicographical sorting
    static class LexicographicalComparator implements Comparator<List<Integer>> {
        @Override
        public int compare(List<Integer> list1, List<Integer> list2) {
            for (int i = 0; i < Math.min(list1.size(), list2.size()); i++) {
                int cmp = Integer.compare(list1.get(i), list2.get(i));
                if (cmp != 0) {
                    return cmp;
                }
            }
            return Integer.compare(list1.size(), list2.size());
        }
    }
}
