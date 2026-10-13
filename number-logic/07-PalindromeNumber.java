
/*
 * Program: Palindrome Number
 * Description: Check whether a number remains the same
 *              when its digits are reversed.
 * Example: Input = 121, Output = Palindrome Number
 */

import java.util.Scanner;

class PalindromeNumber {
    public static void main(String[] args) {

        // Create Scanner object to take user input
        Scanner sc = new Scanner(System.in);

        // Ask the user to enter a number
        System.out.print("Enter The Number: ");
        int num = sc.nextInt();

        // Store the original number for comparison
        int original = num;

        // Initialize the reversed number
        int reverse = 0;

        // Reverse the number using its digits
        while (num > 0) {
            int digit = num % 10;            // Extract the last digit
            reverse = reverse * 10 + digit;  // Build the reversed number
            num /= 10;                       // Remove the last digit
        }

        // Compare the original and reversed numbers
        if (original == reverse) {
            System.out.println("Palindrome Number");
        } else {
            System.out.println("Not a Palindrome Number");
        }

        // Close the Scanner
        sc.close();
    }
}
