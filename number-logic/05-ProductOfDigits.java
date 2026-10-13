
/*
 * Program: Product of Digits in a Number
 * Description: Calculate the product of all digits in a given number.
 * Example: Input = 1234, Output = 24
 * Calculation: 1 * 2 * 3 * 4 = 24
 */

import java.util.Scanner;

class ProductOfDigits {
    public static void main(String[] args) {

        // Create Scanner object to take user input
        Scanner sc = new Scanner(System.in);

        // Ask the user to enter a number
        System.out.print("Enter The Number: ");
        int num = sc.nextInt();

        // Initialize the product to 1
        int product = 1;

        // Repeat the loop while i is less than or equal to num
        for (int i = 0; i <= num; i++) {

            int digit = num % 10;  // Extract the last digit
            product *= digit;      // Multiply the digit with product
            num /= 10;             // Remove the last digit
        }

        // Display the product of digits
        System.out.println("Product of Digits = " + product);

        // Close the Scanner
        sc.close();
    }
}
