package tasks.task2;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SolutionTest {

    @Test
    public void testSolution() {

        Solution solution = new Solution();
        assertEquals(0, solution.solution(new int[]{30, 20, 10}));
        assertEquals(4, solution.solution(new int[]{2, 2, 2, 2, 1, 2, -1, 2, 1, 3}));
        assertEquals(5, solution.solution(new int[]{1, 2, 3, 2, 3, 1, 2, 3, 4}));
    }
}
