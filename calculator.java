import java.util.Scanner;

public class calculator {
    public static void main(String[] args) {
        String yn;
        Scanner s = new Scanner(System.in); // Scanner moved outside the loop

        do {
            System.out.println("Enter first number:");
            int no1 = s.nextInt();
            System.out.println("Enter second number:");
            int no2 = s.nextInt();
            System.out.println("Select Symbols (+,-,*,/,^):");
            String sym = s.next();

            double res;

            switch (sym) {
                case "+":
                    res = no1 + no2;
                    System.out.println("Addition of two numbers is: " + res);
                    break;
                case "-":
                    res = no1 - no2;
                    System.out.println("Subtraction of two numbers is: " + res);
                    break;
                case "*":
                    res = no1 * no2;
                    System.out.println("Multiplication of two numbers is: " + res);
                    break;
                case "/":
                    if (no2 != 0) {
                        res = (double) no1 / no2;
                        System.out.println("Division of two numbers is: " + res);
                    } else {
                        System.out.println("Error: Division by zero is not allowed.");
                    }
                    break;
                case "^":
                    res = Math.pow(no1, no2);
                    System.out.println(no1 + " raised to the power of " + no2 + " is: " + res);
                    break;
                default:
                    System.out.println("Invalid Symbol");
                    break;
            }

            System.out.println("Do you want to continue? Press 'y' for yes, 'n' for no.");
            yn = s.next();

        } while (yn.equalsIgnoreCase("y"));

        s.close(); 
    }
}