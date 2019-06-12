package tasks.task8;

import static java.lang.Integer.parseInt;

/**
 * https://app.codility.com/c/feedback/QY5MEQ-K6Z/
 */

public class Solution {

    public int solution(int A, int B) {

        String AA = String.valueOf(A);
        String BB = String.valueOf(B);

        int c = Math.min(AA.length(), BB.length());

        StringBuilder zipped = new StringBuilder();

        for (int i = 0; i < c; i++)
            zipped.append(AA.charAt(i)).append(BB.charAt(i));

        zipped.append(AA.substring(c)).append(BB.substring(c));

        int Z = parseInt(zipped.toString());

        return Z > 100000000 ? -1 : Z;
    }

    public static void main(String[] args) {

        Solution solution = new Solution();

        System.out.println(solution.solution(12, 56));
        System.out.println();

        System.out.println(solution.solution(12345, 678));
        System.out.println();

        System.out.println(solution.solution(1234, 0));
        System.out.println();
    }
}
