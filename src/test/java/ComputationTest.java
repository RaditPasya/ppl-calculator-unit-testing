import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ComputationTest {
    private Computation computation;

    @BeforeEach
    public void setUp() {
        computation = new Computation();
    }

    @Test
    public void testAddition() {
        String result = computation.performCalculation(5, 3, "+");
        Assertions.assertEquals("8", result);
    }

    @Test
    public void testSubtraction() {
        String result = computation.performCalculation(10, 5, "-");
        Assertions.assertEquals("5", result);
    }

    @Test
    public void testMultiplication() {
        String result = computation.performCalculation(4, 7, "*");
        Assertions.assertEquals("28", result);
    }

    @Test
    public void testDivision() {
        String result = computation.performCalculation(10, 2, "/");
        Assertions.assertEquals("5", result);
    }

    @Test
    public void testDivision2() {
        String result = computation.performCalculation(0, 0, "/");
        Assertions.assertEquals("Error: Cannot divide by zero !", result);
    }


    @Test
    public void testInvalidOperator() {
        String result = computation.performCalculation(10, 5, "%");
        Assertions.assertEquals("Error: Invalid operator!", result);
    }


}
