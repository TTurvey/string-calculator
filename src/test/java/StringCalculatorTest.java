import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class StringCalculatorTest {

    @Test
    public void
    given_decimal_returns_roman_numeral_string() {
        assertEquals(1, new StringCalculator().add("1"));
        assertEquals(2, new StringCalculator().add("2"));
        assertEquals(3, new StringCalculator().add("3"));
        assertEquals(3, new StringCalculator().add("1,2"));
        assertEquals(7, new StringCalculator().add("3,4"));
    }
}
