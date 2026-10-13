
/*
 * Program: Sum of Digits in a Number
 * Description: Calculate the sum of all digits in a given number.
 * Example: Input = 1234, Output = 10
 */

import java.util.Scanner;

class SumOfDigits {
    public static void main(String[] args) {

        // Create Scanner object to take user input
        Scanner sc = new Scanner(System.in);

        // Ask the user to enter a number
        System.out.print("Enter The Number: ");
        int num = sc.nextInt();

        // Initialize the sum
        int sum = 0;

        // Repeat the loop while i is less than or equal to num
        for (int i = 0; i <= num; i++) {

            int digit = num % 10;  // Extract the last digit
            sum += digit;          // Add the digit to the sum
            num /= 10;             // Remove the last digit
        }

        // Display the sum of digits
        System.out.println("Sum of Digits = " + sum);

        // Close the Scanner
        sc.close();
    }
}
