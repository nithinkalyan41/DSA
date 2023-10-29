class Solution {
    public static int minTimeToVisitAllPoints(int[][] points) {
        int[] first = points[0];
        int count = 0;
        for(int i=1; i<points.length; i++) {
            int second[] = points[i];
            int x1 = first[0], x2 = second[0];
            int y1 = first[1], y2 = second[1];
            double distance = Math.sqrt(mul(x2, x1)+mul(y2, y1));
            System.out.println(distance);
            double f = Math.floor(distance);
            System.out.println(f);
            count += f;
            first[0] = second[0];
            first[1] = second[1];
        }
        return count;
    }

    static int mul(int a, int b) {
        return (a-b)*(a-b);
    }

    public static void main(String[] args) {
        System.out.println(minTimeToVisitAllPoints(new int[][]{
                {1,1}, {3,4}, {-1, 0}
        }));
    }
}