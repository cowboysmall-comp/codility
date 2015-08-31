package demos;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class EquiTest {

    @Test
    public void testSomething() {

        Equi equi = new Equi();
        assertEquals(1, equi.solution(new int[]{-1, 3, -4, 5, 1, -6, 2, 1}));
    }
}
