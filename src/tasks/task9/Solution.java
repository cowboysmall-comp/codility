package tasks.task9;

import java.util.Stack;

import static java.lang.Integer.parseInt;
import static java.lang.String.valueOf;

/**
 * https://app.codility.com/c/feedback/QY5MEQ-K6Z/
 */

public class Solution {

    public int solution(String S) {

        try {

            Stack<Integer> stack = new Stack<>();

            for (char s : S.toCharArray())
                if (s == '+')
                    stack.push(stack.pop() + stack.pop());
                else if (s == '*')
                    stack.push(stack.pop() * stack.pop());
                else
                    stack.push(parseInt(valueOf(s)));

            return stack.pop();

        } catch (Exception e) {

            return -1;
        }
    }

    public static void main(String[] args) {

        Solution solution = new Solution();

        System.out.println(solution.solution("13+62*7+*"));
        System.out.println();

        System.out.println(solution.solution("11++"));
        System.out.println();
    }
}
