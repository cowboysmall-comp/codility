package tasks.task1;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SolutionTest {

    @Test
    public void testSolution() {

        Solution solution = new Solution();
        assertEquals(-10, solution.solution(new int[]{1, 2, 3, 42, 1, -10}));
    }
}
