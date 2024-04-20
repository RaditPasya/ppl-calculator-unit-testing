import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;


import java.util.Scanner;

public class ValidationTest {
    
    private Validator validator;
    private final ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
    private final PrintStream originalOut = System.out;

    @BeforeEach
    public void setUp() {
        validator = new Validator();
        System.setOut(new PrintStream(outputStream));
    }

    @AfterEach
    public void tearDown() {
        System.setOut(originalOut);
    }

    @Test
    public void testCheckInt() {
        String[] array = {"1", "dua"};

        // Test valid index with integer
        Assertions.assertTrue(validator.checkInt(array, 1));

        // Test valid index with non-integer
        Assertions.assertFalse(validator.checkInt(array, 2));
    }

    @Test
    public void testValidate() {
        String[] input;
        String expectedOutput1 = "One or more inputted number is not a number";
        String expectedOutput2 = "One or more inputted number is out of range";

        // Test dua input numerik valid (di dalam rentang MIN_VALUE hingga MAX_VALUE tipe data integer)
        input = new String[]{"12500", "4000"};
        Assertions.assertTrue(validator.validate(input));

        // Test dua input numerik invalid (di luar rentang MIN_VALUE tipe data integer)
        input = new String[]{"-2147483649", "214"};
        Assertions.assertFalse(validator.validate(input));
        Assertions.assertTrue(outputStream.toString().contains(expectedOutput1));

        // Test dua input numerik invalid (di luar rentang MIN_VALUE tipe data integer)
        input = new String[]{"2147483648", "412"};
        Assertions.assertFalse(validator.validate(input));
        Assertions.assertTrue(outputStream.toString().contains(expectedOutput1));

        // Test dua input String
        input = new String[]{"asdasd", "nasdasdih"};
        Assertions.assertFalse(validator.validate(input));
        Assertions.assertTrue(outputStream.toString().contains(expectedOutput1));

        // Test satu input integer dan satu input String
        input = new String[]{"asd", "4214"};
        Assertions.assertFalse(validator.validate(input));
        Assertions.assertTrue(outputStream.toString().contains(expectedOutput1));
    }

    @Test
    public void testValidate2ValidInput() {
        Assertions.assertTrue(validator.validate2("+", 5));
    }

    @Test
    public void testValidate2InvalidOperator() {
        Assertions.assertFalse(validator.validate2("=", 5));
    }

    @Test
    public void testValidate2DivisionByZero() {
        Assertions.assertFalse(validator.validate2("/", 0));
    }

    @Test
    public void testValidate2ValidOperatorZeroNumber() {
        Assertions.assertTrue(validator.validate2("-", 0));
    }

    @Test
    public void testValidate2InvalidOperatorAndNonZeroNumber() {
        Assertions.assertFalse(validator.validate2("&", 10));
    }
}
