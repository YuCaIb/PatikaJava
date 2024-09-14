package src;

import java.util.Scanner;

public class hesapmakinesi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1, n2, select;
        boolean validInput = false;  // To control the loop

        while (!validInput) {  // Continue until a valid selection is made
            System.out.println("Enter first number: ");
            n1 = sc.nextInt();
            System.out.println("Enter second number: ");
            n2 = sc.nextInt();
            System.out.println("Please select the desired operation: \n1-Sum\n2-Subtraction\n3-Multiplication\n4-Division");
            select = sc.nextInt();

            switch (select) {
                case 1:
                    System.out.println("You have selected sum. The total is: " + (n1 + n2));
                    validInput = true;  // Mark as valid input
                    break;

                case 2:
                    System.out.println("You have selected subtraction. The result is: " + (n1 - n2));
                    validInput = true;  // Mark as valid input
                    break;

                case 3:
                    System.out.println("You have selected multiplication. The result is: " + (n1 * n2));
                    validInput = true;  // Mark as valid input
                    break;

                case 4:
                    if (n2 == 0) {
                        System.out.println("You can't divide by zero. Choose a second number other than zero.");
                    } else {
                        System.out.println("You have selected division. The result is: " + (float) n1 / n2);
                        validInput = true;  // Mark as valid input
                    }
                    break;

                default:
                    System.out.println("Invalid selection. Please select a valid operation.");
                    break;  // No valid input yet, so loop continues
            }
        }
    }
}
