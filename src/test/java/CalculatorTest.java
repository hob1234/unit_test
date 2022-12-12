import org.junit.Test;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.DisplayNameGeneration;
import org.junit.jupiter.api.DisplayNameGenerator;

import static org.junit.jupiter.api.Assertions.*;

@DisplayNameGeneration(DisplayNameGenerator.Standard.class)
public class CalculatorTest {
    Calculator calculator = new Calculator();

    @DisplayName("multiply test")
    @Test
    public void testMultiply() {
        double a = -1.0;
        double b = 4;
        double c = 0;


        assertEquals(-4.0, calculator.multiply(a, b));
        assertEquals(-0.0, calculator.multiply(a, c));
    }

    @Test
    public void testDivide() {
        double a = -1.0;
        double b = 4;
        double c = 0;

        assertEquals(calculator.divide(a, b), -0.25);
        assertThrows(ArithmeticException.class, () -> calculator.divide(a,c));
    }

    @Test
    public void testSubtract() {
        double a = -1.0;
        double b = 4;
        double c = 0;

        assertEquals( -5.0,calculator.subtract(a, b));
        assertEquals( -1.0,calculator.subtract(a, c));
    }

    @Disabled
    @Test
    public void testSum() {
        double a = -1.0;
        double b = 4;
        double c = 0;

        assertEquals( 3.0, calculator.sum(a, b));
        assertEquals( -1.0, calculator.sum(a, c));
    }

}