package tasks.task7;


/**
 *
 * Write a function:
 *
 *     class Solution { public int solution(int[] A); }
 *
 * that, given an array A of N integers, returns the smallest positive integer
 * (greater than 0) that does not occur in A.
 *
 * For example, given A = [1, 3, 6, 4, 1, 2], the function should return 5.
 * Given A = [1, 2, 3], the function should return 4.
 * Given A = [−1, −3], the function should return 1.
 *
 * Write an efficient algorithm for the following assumptions:
 *
 *     * N is an integer within the range [1..100,000];
 *     * each element of array A is an integer within the range [−1,000,000..1,000,000].
 *
 */

public class Solution {

    public int solution(int[] A) {

        int[] AA = new int[1000000 + 1];

        for (int i = 0; i < A.length; i++)
            if (A[i] > 0)
                AA[A[i]] += 1;

        for (int j = 1; j < 1000000 + 1; j++)
            if (AA[j] == 0)
                return j;

        return 1;
    }

    public static void main(String[] args) {

        Solution solution = new Solution();

        System.out.println(solution.solution(new int[]{ 1, 3, 6, 4, 1, 2 }));
        System.out.println();

        System.out.println(solution.solution(new int[]{ 1, 2, 3 }));
        System.out.println();

        System.out.println(solution.solution(new int[]{ -1, -3 }));
        System.out.println();

        System.out.println(solution.solution(new int[]{ 0, 1, 2, 3, 5, 6 }));
        System.out.println();

        System.out.println(solution.solution(new int[]{ -1000000, 1, 2, 3, 5, 6, 1000000 }));
        System.out.println();
    }
}
