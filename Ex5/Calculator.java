package Ex5;

import java.util.Scanner;

public class Calculator {
    public static void calculator(Scanner scanner) {
        double operand1 = returnDouble(scanner);
        double operand2 = returnDouble(scanner);
        System.out.println("Enter arithmetic operation: ");
        String sign = scanner.nextLine();
        switch (sign) {
            case "+" -> System.out.println(operand1 + " " + sign + " " + operand2 + " = " + add(operand1, operand2));
            case "-" -> System.out.println(operand1 + " " + sign + " " + operand2 + " = " + sub(operand1, operand2));
            case "*" -> System.out.println(operand1 + " " + sign + " " + operand2 + " = " + mul(operand1, operand2));
            case "/" -> System.out.println(operand1 + " " + sign + " " + operand2 + " = " + div(operand1, operand2));
        }
    }

    private static double returnDouble(Scanner scanner) {
        double number = 0.0;
        while (true) {
            System.out.println("Enter a number: ");
            try {
                number = Double.parseDouble(scanner.nextLine());
                break;
            } catch (Exception e) {
                System.out.println("It must be a number");
            }
        }
        return number;
    }

    public static double add(Double num1, Double num2) {
        return num1 + num2;
    }

    public static double sub(Double num1, Double num2) {
        return num1 - num2;
    }

    public static double mul(Double num1, Double num2) {
        return num1 * num2;
    }

    public static double div(Double num1, Double num2) {
        double res = 0.0;
        try {
            res = num1 / num2;
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return res;
    }
}
