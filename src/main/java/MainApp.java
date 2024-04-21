public class MainApp {
    
    public static void main(String[] args) {
        
        Input input = new Input();
        Validator validator = new Validator();
        Computation computation = new Computation();
        

        String[] inputNumber = input.getNumberInput();
        if (!validator.validate(inputNumber)) {
            
            return;
        }

        int num1 = Integer.parseInt(inputNumber[0]);
    	int num2 = Integer.parseInt(inputNumber[1]);

        String operator = input.getOperatorInput();

        if ( !validator.validate2(operator, num2)) {
            System.out.println("invalid operator");
            return;
        }
        String result = computation.performCalculation(num1, num2, operator);
        System.out.println("Result: " + result);

    }
}
