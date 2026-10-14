
/*
 * Program: Positive, Negative or Zero
 * Description: Check whether the given number is positive,
 *              negative or zero.
 * Example: Input = -5, Output = -5 is a NEGATIVE NUMBER
 */

import java.util.Scanner;

class Main {
    public static void main(String args[]) {

        // Create Scanner object to take input
        Scanner sc = new Scanner(System.in);

        // Ask the user to enter a number
        System.out.print("Enter The Number: ");
        int num = sc.nextInt();

        // Check whether the number is positive, negative or zero
        if (num > 0) {
            System.out.println(num + " is a POSITIVE NUMBER");
        } else if (num < 0) {
            System.out.println(num + " is a NEGATIVE NUMBER");
        } else {
            System.out.println("Number is ZERO");
        }

        // Close the Scanner
        sc.close();
    }
}
