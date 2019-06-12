package tasks.task6;


public class Solution {

    public void solution(int[] A, int K) {

        int length = A.length;
        int counter = 0;

        int max = -1;
        for (int a : A)
            if (max < a)
                max = a;

        int cLen = String.valueOf(max).length();

        int rows = (length / K) + (length % K > 0 ? 1 : 0);
        int cols = length < K ? length : K;

        System.out.print("+");
        for (int j = 0; j < cols; j++) {

            for (int k = 0; k < cLen; k++)
                System.out.print("-");

            System.out.print("+");
        }

        System.out.println();

        for (int i = 0; i < rows; i++) {

            int cCount = 0;

            System.out.print("|");
            for (int j = 0; j < cols; j++) {

                if (counter < length) {

                    int pLen = cLen - String.valueOf(A[counter]).length();

                    if (pLen > 0)
                        for (int k = 0; k < pLen; k++)
                            System.out.print(" ");

                    System.out.print(A[counter++]);
                    System.out.print("|");
                    cCount++;
                }
            }

            System.out.println();

            System.out.print("+");
            for (int j = 0; j < cCount; j++) {

                for (int k = 0; k < cLen; k++)
                    System.out.print("-");

                System.out.print("+");
            }

            System.out.println();
        }
    }

    public static void main(String[] args) {

        Solution solution = new Solution();
        solution.solution(new int[]{4, 35, 80, 123, 12345, 44, 8, 5}, 10);
        System.out.println();
        solution.solution(new int[]{4, 35, 80, 123, 12345, 44, 8, 5}, 1000000000);
        System.out.println();
        solution.solution(new int[]{4, 35, 80, 123, 12345, 1000000000, 44, 8, 5}, 4);
        System.out.println();
        solution.solution(new int[]{4, 35, 80, 123, 12345, 1000000000, 44, 8, 5}, 1000000000);
        System.out.println();
        solution.solution(new int[]{4, 35, 80, 123, 12345, 44, 8, 5, 24, 3}, 4);
        System.out.println();
        solution.solution(new int[]{4, 35, 80, 123, 12345, 44, 8, 5, 24, 3, 22, 35}, 4);
        System.out.println();
        solution.solution(new int[]{4, 35, 80, 123, 12345, 1000000000, 44, 8, 5, 24, 3, 22, 35}, 4);
    }
}
