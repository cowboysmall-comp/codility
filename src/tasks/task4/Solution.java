package tasks.task4;


public class Solution {

    public int solution(int X, int Y, int[] A) {

        int N = A.length;
        int result = -1;

        int nX = 0;
        int nY = 0;

        for (int i = 0; i < N; i++) {

            if (A[i] == X)
                nX += 1;
            if (A[i] == Y)
                nY += 1;

            if (nX == nY)
                result = i;
        }
        return result;
    }

    public static void main(String[] args) {

        Solution solution = new Solution();
        System.out.println(Integer.toString(solution.solution(7, 42, new int[]{6, 42, 11, 7, 1, 42})));
    }
}
