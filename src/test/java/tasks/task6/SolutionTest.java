package tasks.task6;

import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class SolutionTest {

    private static final String EXPECTED_2 =
            "+---+---+\n" +
            "|  6| 42|\n" +
            "+---+---+\n" +
            "| 11|  7|\n" +
            "+---+---+\n" +
            "|  1|420|\n" +
            "+---+---+\n";

    private static final String EXPECTED_3 =
            "+---+---+---+\n" +
            "|  6| 42| 11|\n" +
            "+---+---+---+\n" +
            "|  7|  1|420|\n" +
            "+---+---+---+\n";

    private static final String EXPECTED_4 =
            "+---+---+---+---+\n" +
            "|  6| 42| 11|  7|\n" +
            "+---+---+---+---+\n" +
            "|  1|420|\n" +
            "+---+---+\n";

    private static final String EXPECTED_5 =
            "+---+---+---+---+---+\n" +
            "|  6| 42| 11|  7|  1|\n" +
            "+---+---+---+---+---+\n" +
            "|420|\n" +
            "+---+\n";

    private static final String EXPECTED_6 =
            "+---+---+---+---+---+---+\n" +
            "|  6| 42| 11|  7|  1|420|\n" +
            "+---+---+---+---+---+---+\n";

    private static final String EXPECTED_7 =
            "+-----+-----+-----+-----+-----+-----+-----+-----+\n" +
            "|    4|   35|   80|  123|12345|   44|    8|    5|\n" +
            "+-----+-----+-----+-----+-----+-----+-----+-----+\n";

    private static final String EXPECTED_8 =
            "+-----+-----+-----+-----+\n" +
            "|    4|   35|   80|  123|\n" +
            "+-----+-----+-----+-----+\n" +
            "|12345|   44|    8|    5|\n" +
            "+-----+-----+-----+-----+\n" +
            "|   24|    3|\n" +
            "+-----+-----+\n";

    private static final String EXPECTED_9 =
            "+-----+-----+-----+-----+\n" +
            "|    4|   35|   80|  123|\n" +
            "+-----+-----+-----+-----+\n" +
            "|12345|   44|    8|    5|\n" +
            "+-----+-----+-----+-----+\n" +
            "|   24|    3|   22|   35|\n" +
            "+-----+-----+-----+-----+\n";

    @Test
    public void testSolution() {

        Solution solution = new Solution();

        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        solution.solution(new int[]{6, 42, 11, 7, 1, 420}, 2);
        assertEquals(EXPECTED_2, out.toString());

        out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        solution.solution(new int[]{6, 42, 11, 7, 1, 420}, 3);
        assertEquals(EXPECTED_3, out.toString());

        out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        solution.solution(new int[]{6, 42, 11, 7, 1, 420}, 4);
        assertEquals(EXPECTED_4, out.toString());

        out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        solution.solution(new int[]{6, 42, 11, 7, 1, 420}, 5);
        assertEquals(EXPECTED_5, out.toString());

        out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        solution.solution(new int[]{6, 42, 11, 7, 1, 420}, 6);
        assertEquals(EXPECTED_6, out.toString());

        out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        solution.solution(new int[]{6, 42, 11, 7, 1, 420}, 7);
        assertEquals(EXPECTED_6, out.toString());

        out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        solution.solution(new int[]{4, 35, 80, 123, 12345, 44, 8, 5}, 10);
        assertEquals(EXPECTED_7, out.toString());

        out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        solution.solution(new int[]{4, 35, 80, 123, 12345, 44, 8, 5, 24, 3}, 4);
        assertEquals(EXPECTED_8, out.toString());

        out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        solution.solution(new int[]{4, 35, 80, 123, 12345, 44, 8, 5, 24, 3, 22, 35}, 4);
        assertEquals(EXPECTED_9, out.toString());
    }
}
