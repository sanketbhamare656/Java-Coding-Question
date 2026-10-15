
/*
 * Program: Prime Number
 * Description: Check whether the given number is prime or not.
 * Example: Input = 7
 *          Output = 7 is a PRIME NUMBER
 */

import java.util.Scanner;

class PrimeNumber {
    public static void main(String args[]) {

        // Create Scanner object to take input
        Scanner sc = new Scanner(System.in);

        // Ask the user to enter a number
        System.out.print("Enter The Number: ");
        int num = sc.nextInt();

        boolean isPrime = true;

        // Check whether the number is prime
        if (num <= 1) {
            isPrime = false;
        } else {
            for (int i = 2; i < num; i++) {
                if (num % i == 0) {
                    isPrime = false;
                    break;
                }
            }
        }

        // Display the result
        if (isPrime) {
            System.out.println(num + " is a PRIME NUMBER");
        } else {
            System.out.println(num + " is NOT a PRIME NUMBER");
        }

        // Close the Scanner
        sc.close();
    }
}