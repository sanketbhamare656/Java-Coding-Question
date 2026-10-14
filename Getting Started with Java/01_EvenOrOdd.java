
/*
 * Program: Even or Odd Number
 * Description: Check whether the given number is even or odd.
 * Example: Input = 4, Output = 4 Number is EVEN NUMBER
 */

import java.util.Scanner;

class Main {
    public static void main(String args[]) {

        // Create Scanner object to take input
        Scanner sc = new Scanner(System.in);

        // Ask the user to enter a number
        System.out.print("Enter The Number: ");
        int num = sc.nextInt();

        // Check whether the number is even or odd
        if (num % 2 == 0) {
            System.out.println(num + " Number is EVEN NUMBER");
        } else if (num % 2 != 0) {
            System.out.println(num + " Number is ODD NUMBER");
        } else {
            System.out.println("Number is Zero");
        }

        // Close the Scanner
        sc.close();
    }
}
