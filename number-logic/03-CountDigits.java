/*
 * Program: Count Digits in a Number
 * Description: Count the total number of digits in a given number.
 * Example: Input = 1234, Output = 4
 */

import java.util.Scanner;

class CountDigits {
    public static void main(String[] args) {

        // Create Scanner object to take user input
        Scanner sc = new Scanner(System.in);

        // Ask the user to enter a number
        System.out.print("Enter The Number: ");
        int num = sc.nextInt();

        // Initialize the digit counter
        int count = 0;

        // Repeat the loop while i is less than or equal to num
        for (int i = 0; i <= num; i++) {

            num /= 10;  // Remove the last digit (num = num / 10)

            count++;    // Increase the digit counter
        }

        // Display the total count of digits
        System.out.println("Count of Digits = " + count);

        // Close the Scanner
        sc.close();
    }
}