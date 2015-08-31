package tasks.task3;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SolutionTest {

    @Test
    public void testSolution() {

        Solution solution = new Solution();
        assertEquals("ew tset sredoc", solution.solution("we test coders"));
    }
}
