
import java.util.Scanner;

public class Calculator {
    public static void main (String[] args) {
        //Initialize Scanner Class
        Scanner scanner = new Scanner(System.in);

        //Welcome and Versioning
        System.out.println("Calculator v0.1.0 by Austin (acdurr) Durr");
        String operator = "Null";
        


        while (true) {

            System.out.println("Input Desired Operation:");
            operator = scanner.nextLine();


            if (operator.equals("+")) {
                System.out.println("Addition Selected");
                break;
            } else if (operator.equals("-")) {
                System.out.println("Subtraction Selected");
                break;
            } else if (operator.equals("/")) {
                System.out.println("Division Selected");
                break;
            } else if (operator.equals("*")) {
                System.out.println("Multiplication Selected");
                break;
            } else {
                System.out.println("Invalid Operation.");
            }
        }

        System.out.println("Input first number:");
        double firstNumber = Double.valueOf(scanner.nextLine());
        System.out.println("Input second number:");
        double secondNumber = Double.valueOf(scanner.nextLine());

        System.out.println("Performing Operation...");

        if (operator.equals("+")) {
            System.out.println(firstNumber + " + " + secondNumber + " = " + (firstNumber + secondNumber));
        } else if (operator.equals("-")) {
            System.out.println(firstNumber + " - " + secondNumber + " = " + (firstNumber - secondNumber));
        } else if (operator.equals("/")) {
            System.out.println(firstNumber + " / " + secondNumber + " = " + (firstNumber / secondNumber));
        } else if (operator.equals("*")) {
            System.out.println(firstNumber + " * " + secondNumber + " = " + (firstNumber * secondNumber));
        }


    }
}