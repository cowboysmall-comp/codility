package tasks.task1;


/*
    https://codility.com/c/feedback/B5JZQ8-MHF

*/
public class Solution {

    public int solution(int[] A) {
        
        int min = Integer.MAX_VALUE;

        for (int a : A)
            if (a < min)
                min = a;

        return min;
    }

    public static void main(String[] args) {

        Solution solution = new Solution();
        System.out.println(Integer.toString(solution.solution(new int[]{1, 2, 3, 42, 1, -10})));
    }
}
