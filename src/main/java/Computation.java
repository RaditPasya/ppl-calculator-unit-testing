public class Computation {

    public Computation() {
    }



    public String performCalculation(int num1, int num2, String operator) {

        int result;
        switch (operator) {
            case "+":
                result = num1 + num2;
                break;
            case "-":
                result = num1 - num2;
                break;
            case "*":
                result = num1 * num2;
                break;
            case "/":
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
