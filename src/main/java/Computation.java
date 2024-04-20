public class Computation {
    private Validator validator;

    public Computation() {
        this.validator = new Validator();
    }

    public Computation(Validator validator) {
        this.validator = validator;
    }


    public String performCalculation(int num1, int num2, char operator) {
        if (!validator.isValidRange(num1) || !validator.isValidRange(num2)) {
            return "Error: Numbers must be within the range of -32768 and 32767.";
        }

        int result;
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
                if (num1 == 0 && num2 == 0) {
                    return "Infinity";
                }
                result = num1 / num2;
                break;
            default:
                return "Error: Invalid operator!";
        }
        return String.valueOf(result);
    }
}
