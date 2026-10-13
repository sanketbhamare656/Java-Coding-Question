
/*
 * Program: Return Last Digit
 * Description: Extract the last digit of a number.
 * Example: Input = 1234, Output = 4
 */

import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take input from the user
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        // Extract the last digit using modulo
        int lastDigit = num % 10;

        // Display the result
        System.out.println("Last digit: " + Math.abs(lastDigit));

        sc.close();
    }
}
