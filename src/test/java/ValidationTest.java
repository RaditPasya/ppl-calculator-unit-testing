import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.util.Scanner;

public class ValidationTest {
    private Validator validator;

    @BeforeEach
    public void setUp() {
        validator = new Validator();
    }

    @Test
    public void testInvalidInputs1() {
        boolean result = validator.validateInputs(100000, 0, '/');
        Assertions.assertFalse(result);
    }

    @Test
    public void testInvalidInputs2() {
        boolean result = validator.validateInputs(0, 0, '/');
        Assertions.assertFalse(result);
    }

}
