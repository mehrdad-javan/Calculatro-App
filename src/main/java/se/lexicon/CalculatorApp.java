package se.lexicon;


import java.util.Scanner;

public class CalculatorApp {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // loop
        do {
            displayMenu();

            System.out.println("Enter your choice:");
            int choice = scanner.nextInt();

            if (choice == 5) {
                System.out.println("Exiting the calculator application.");
                break;
            }

            double result = performOperation(choice);
            System.out.println("result = " + result);

        } while (true);


    } // main method


    public static void displayMenu() {
        System.out.println("Select Operation:");
        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");
        System.out.println("5. Exit");
    }


    public static double performOperation(int choice) {
        double result = 0.0;
        switch (choice) {
            case 1:
                result = performAddition();
                break;
            case 2:
                result = performSubtraction();
                break;
            case 3:
                result = performMultiplication();
                break;

            case 4:
                result = performDivision();
                break;
            default:
                System.out.println("Invalid choice. please enter a valid option.");
        }

        return result;
    }
    // define 4 methods to operate the operations

    public static double performAddition() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number:");
        double number1 = scanner.nextDouble();

        System.out.println("Enter a number:");
        double number2 = scanner.nextDouble();

        return number1 + number2;
    }

    public static double performSubtraction() {
        double number1 = getDoubleNumber();
        double number2 = getDoubleNumber();
        return number1 - number2;
    }

    public static double performMultiplication() {
        double result = 1.0;
        double operand;
        do {
            operand = getDoubleNumber();
            System.out.println("Result: " + result + " * " + operand + " = " + (result * operand));
            result = result * operand;

            boolean isContinue = isContinue();
            if (!isContinue) {
                break;
            }
        } while (true);

        return result;
    }

    public static double performDivision() {
        // todo: needs completion
        return 0.0;
    }


    public static double getDoubleNumber() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a Number:");
        return scanner.nextDouble();
    }

    public static boolean isContinue() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Do you want to continue? (1=yes, 0=no)");
        int option = scanner.nextInt();
        if (option == 1) {
            return true;
        } else {
            return false;
        }
    }


}
