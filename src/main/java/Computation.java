public class Computation {
    public String performCalculation(int num1, int num2, char operator) {
        Validator validator = new Validator();
        if (!validator.validateInputs(num1, num2, operator)) {
            return "Error: Invalid inputs or operator!";
        }

        int result;  // Changed to int for integer results
        switch (operator) {
            case '+':
                result = num1 + num2;
                break;
            case '-':
                result = num1 - num2;
                break;
            case '*':
                result = num1 * num2;
                break;
            case '/':
                if (num2 == 0) {
                    return "Error: Division by zero is not allowed!";
                }
                result = num1 / num2;  // Cast to int for integer division
                break;
            default:
                return "Error: Invalid operator!";
        }
        return String.valueOf(result);
    }
}
