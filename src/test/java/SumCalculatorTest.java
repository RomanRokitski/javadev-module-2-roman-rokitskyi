import org.example.SumCalculator;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class SumCalculatorTest {
    private SumCalculator calc;

    @BeforeEach
    public void beforeEach() {
        calc = new SumCalculator();
    }

    @Test
    public void testThatSumFor1IsCorrect() {
        int actual = calc.sum(1);
        int expected = 1;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testThatSumFor3IsCorrect() {
        int actual = calc.sum(3);
        int expected = 6;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testThatSumFor9IsCorrect() {
        int actual = calc.sum(9);
        int expected = 45;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testThatSumFor0ThrowsIllegalArgumentException() {
        Assertions.assertThrows(
                IllegalArgumentException.class,
                () -> calc.sum(0)
        );
    }
}
