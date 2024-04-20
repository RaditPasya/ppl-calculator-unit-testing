import java.util.Scanner;

public class Validator {
    private Scanner scanner;

    public Validator() {
        this.scanner = new Scanner(System.in);
    }

    public Validator(Scanner scanner) {
        this.scanner = scanner;
    }

    public boolean isValidRange(int num) {
        return num >= -32768 && num <= 32767;
    }

    public int getValidNumber(String prompt) {
        int num = 0;
        boolean isValidInput = false;
        do {
            try {
                System.out.print(prompt);
                num = scanner.nextInt();
                isValidInput = true;
            } catch (Exception e) {
                System.out.println("Invalid input. Please enter a valid number.");
                scanner.next(); // clear buffer
            }
        } while (!isValidInput || num < -32768 || num > 32767);
        return num;
    }

    public char getValidOperator(String prompt) {
        char operator = 0;
        boolean isValidInput = false;
        do {
            try {
                System.out.print(prompt);
                operator = scanner.next().charAt(0);
                if (operator != '+' && operator != '-' && operator != '*' && operator != '/') {
                    throw new IllegalArgumentException("Invalid operator.");
                }
                isValidInput = true;
            } catch (Exception e) {
                System.out.println("Invalid input. Please enter a valid operator (+, -, *, /).");
                scanner.next(); // clear buffer
            }
        } while (!isValidInput);
        return operator;
    }

    public boolean validateInputs(int num1, int num2, char operator) {
        return !(operator == '/' && num2 == 0 && num1 != 0);
    }

    public String getOperatorErrorMessage() {
        return "Error: Invalid operator!";
    }

    public String getDivisionByZeroErrorMessage() {
        return "Error: Division by zero is not allowed!";
    }

    public void closeScanner() {
        scanner.close();
    }
}
