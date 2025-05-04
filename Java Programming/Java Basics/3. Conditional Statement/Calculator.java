import java.util.*;
public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        int num1 = scanner.nextInt();
        System.out.println("Enter the second number: ");
        int num2 = scanner.nextInt();
        System.out.println("Enter the operator (+, -, *, /, %): ");
        String operator = scanner.next();
        switch (operator) {
            case "+":
            System.out.println("Result: " + (num1 + num2));
            break;
            case "-":
            System.out.println("Result: " + (num1 - num2));
            break;
            case "*":
            System.out.println("Result:"+(num1*num2));
            break;
            case "/":
            if (num2 != 0) {
                System.out.println("Result: " + (num1 / num2));
            }
            else {
                System.out.println("Error: Division by zero is not allowed");
            }
            break;
            case "%":
            if (num2 != 0) {
                System.out.println("Result: " + (num1 % num2));
            }
            else {
                System.out.println("Error: Division by zero is not allowed");
            }
            break;

            default:
            System.out.println("Error: Invalid operator");
            
        }
    }
}
