package tasks.task2;


/*
    https://codility.com/c/feedback/B5JZQ8-MHF

*/
public class Solution {

    public int solution(int[] A) {

        int pos = 0;
        int max = 0;

        int p   = 0;

        for (int q = 1; q < A.length; q++) {

            if (A[q] <= A[q - 1]) {

                p = q;

            } else if (max < q - p + 1) {

                max = q - p + 1;
                pos = p;
            }
        }

        return pos;
    }
}
