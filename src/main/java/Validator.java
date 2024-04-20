public class Validator {
    public boolean validateInputs(int num1, int num2, char operator) {
        return num1 >= -32768 && num1 <= 32767 &&
                num2 >= -32768 && num2 <= 32767 &&
                (operator == '+' || operator == '-' || operator == '*' || operator == '/') &&
                !(operator == '/' && num2 == 0);
    }
}