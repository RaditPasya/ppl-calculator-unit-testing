public class MainApp {
    public static void main(String[] args) {
        Validator validator = new Validator();
        Computation computation = new Computation();

        int num1 = validator.getValidNumber("Enter first number: ");
        int num2 = validator.getValidNumber("Enter second number: ");
        char operator = validator.getValidOperator("Enter operator (+, -, *, /): ");

        while (!validator.validateInputs(num1, num2, operator)) {
            System.out.println("Invalid input. Cannot divide by zero.");
            num2 = validator.getValidNumber("Enter second number: ");
        }

        String result = computation.performCalculation(num1, num2, operator);
        System.out.println("Result: " + result);

        validator.closeScanner();
    }
}
