package tasks.task4;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SolutionTest {

    @Test
    public void testSolution() {

        Solution solution = new Solution();

        assertEquals(5, solution.solution(7, 7, new int[]{6, 42, 11, 7, 1, 42}));
        assertEquals(6, solution.solution(7, 7, new int[]{6, 42, 11, 7, 1, 42, 7}));
        assertEquals(0, solution.solution(7, 7, new int[]{0}));
        assertEquals(2, solution.solution(7, 7, new int[]{7, 7, 7}));
        assertEquals(2, solution.solution(7, 7, new int[]{42, 42, 42}));

        assertEquals(4, solution.solution(7, 42, new int[]{6, 42, 11, 7, 1, 42}));
        assertEquals(6, solution.solution(7, 42, new int[]{6, 42, 11, 7, 1, 42, 7}));
        assertEquals(-1, solution.solution(7, 42, new int[]{7, -1, -1, -1, -1}));
        assertEquals(-1, solution.solution(7, 1000000000, new int[]{1000000000, 1000000000, 1000000000, 1000000000, 1000000000}));
    }
}
