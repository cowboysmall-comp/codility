package tasks.task3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class SolutionTest {

    @Test
    public void testSolution() {

        Solution solution = new Solution();
        assertEquals("ew tset sredoc", solution.solution("we test coders"));
    }
}
