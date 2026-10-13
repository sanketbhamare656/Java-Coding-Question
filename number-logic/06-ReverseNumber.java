
/*
 * Program: Reverse a Number
 * Description: Reverse the digits of a given number.
 * Example: Input = 1234, Output = 4321
 */

import java.util.Scanner;

class ReverseNumber {
    public static void main(String[] args) {

        // Create Scanner object to take user input
        Scanner sc = new Scanner(System.in);

        // Ask the user to enter a number
        System.out.print("Enter The Number: ");
        int num = sc.nextInt();

        // Initialize the reversed number
        int reverse = 0;

        // Repeat the loop while the number is greater than 0
        for (int i = 0; i <= num; i++) {

            int digit = num % 10;           // Extract the last digit
            reverse = reverse * 10 + digit; // Add digit to reversed number
            num /= 10;                      // Remove the last digit
        }

        // Display the reversed number
        System.out.println("Reverse Number = " + reverse);

        // Close the Scanner
        sc.close();
    }
}
