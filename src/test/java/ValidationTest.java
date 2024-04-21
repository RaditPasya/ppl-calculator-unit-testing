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
public void testValidateValidInputs() {
    String[] input = {"12500", "4000"};
    Assertions.assertTrue(validator.validate(input));
}

@Test
public void testValidateInvalidInputOutOfRange1() {
    String[] input = {"-2147483649", "214"};
    String expectedOutput = "One or more inputted number is not a number";
    Assertions.assertFalse(validator.validate(input));
    Assertions.assertTrue(outputStream.toString().contains(expectedOutput));
}

@Test
public void testValidateInvalidInputOutOfRange2() {
    String[] input = {"2147483648", "412"};
    String expectedOutput = "One or more inputted number is not a number";
    Assertions.assertFalse(validator.validate(input));
    Assertions.assertTrue(outputStream.toString().contains(expectedOutput));
}

@Test
public void testValidateInvalidInputString1() {
    String[] input = {"asdasd", "nasdasdih"};
    String expectedOutput = "One or more inputted number is not a number";
    Assertions.assertFalse(validator.validate(input));
    Assertions.assertTrue(outputStream.toString().contains(expectedOutput));
}

@Test
public void testValidateInvalidInputString2() {
    String[] input = {"asd", "4214"};
    String expectedOutput = "One or more inputted number is not a number";
    Assertions.assertFalse(validator.validate(input));
    Assertions.assertTrue(outputStream.toString().contains(expectedOutput));
}



    //TC7
    @Test
    public void testValidate2DivisionByZero() {
        Assertions.assertFalse(validator.validate2("/", 0));
    }

    //TC8
    @Test
    public void testValidate2ValidOperatorZeroNumber() {
        Assertions.assertTrue(validator.validate2("-", 0));
    }

    //TC6
    @Test
    public void testValidate2InvalidOperatorAndNonZeroNumber() {
        Assertions.assertFalse(validator.validate2("&", 10));
    }
}
