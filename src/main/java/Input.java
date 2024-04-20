import java.util.Scanner;

public class Input {
    Scanner scanner = new Scanner(System.in);
    
    public String[] getNumberInput() {
        String[] input = new String[2];
        
        System.out.print("Enter the first number: ");
        input[0] = scanner.nextLine();
        
        System.out.print("Enter the second number: ");
        input[1] = scanner.nextLine();
        
        return input;
    }
    
    public String getOperatorInput() {
        String input = new String();
                
        System.out.print("Enter the operator (+ - * /): ");
        input = scanner.nextLine();
        
        return input;
    }
}
