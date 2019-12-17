package demos;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class EquiTest {

    @Test
    public void testSolution() {

        Equi equi = new Equi();
        assertEquals(1, equi.solution(new int[]{-1, 3, -4, 5, 1, -6, 2, 1}));
    }
}
