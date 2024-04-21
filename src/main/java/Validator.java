

public class Validator {
    
    public boolean checkInt(String[] array, int index) {
        // Check if the index is within the bounds of the array
        index -= 1;
        if (index >= 0 && index < array.length) {
            try {
                Integer.parseInt(array[index]);
                return true;
            } catch (NumberFormatException e) {
                return false;
            }
        } else {
            return false;
        }

    }

    public boolean validate(String[] array) {

        if (!checkInt(array, 1) || !checkInt(array, 2)) {
            System.out.println("One or more inputted number is not a number");
            return false;
        }

        if (array.length >= 2) {
            try {
                int num1 = Integer.parseInt(array[0]);
                int num2 = Integer.parseInt(array[1]);
                // Check if both numbers are within the specified range
                if (num1 >= -32768 && num1 <= 32767 && num2 >= -32768 && num2 <= 32767) {
                    return true;
                } else {
                    System.out.println("One or more inputted number is out of range");
                    return false;
                }
            } catch (NumberFormatException e) {
                // If conversion fails, return false
                
                return false;
            }
        } else {
            // If array does not contain at least 2 elements, return false
            return false;
        }
    }
    

    public boolean validate2(String operator, int number) {
        if (!operator.matches("[+\\-*/]")) {
            System.out.println("Invalid operator please use +, -, *, or /.");
            return false;
        }
        
        if (operator.equals("/") ^ number == 0) {
            System.out.println("division by 0 is not acceptable");
            return false;
        }
        
        return true;
    }
    
}
