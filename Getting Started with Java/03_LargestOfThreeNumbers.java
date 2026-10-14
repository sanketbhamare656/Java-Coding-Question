
/*
 * Program: Largest of Three Numbers
 * Description: Find the largest among three given numbers.
 * Example: Input = 10, 25, 15
 *          Output = 25 is the LARGEST NUMBER
 */

import java.util.Scanner;

class Main {
    public static void main(String args[]) {

        // Create Scanner object to take input
        Scanner sc = new Scanner(System.in);

        // Ask the user to enter three numbers
        System.out.print("Enter First Number: ");
        int num1 = sc.nextInt();

        System.out.print("Enter Second Number: ");
        int num2 = sc.nextInt();

        System.out.print("Enter Third Number: ");
        int num3 = sc.nextInt();

        // Compare the three numbers to find the largest
        if (num1 >= num2 && num1 >= num3) {
            System.out.println(num1 + " is the LARGEST NUMBER");
        } else if (num2 >= num1 && num2 >= num3) {
            System.out.println(num2 + " is the LARGEST NUMBER");
        } else {
            System.out.println(num3 + " is the LARGEST NUMBER");
        }

        // Close the Scanner
        sc.close();
    }
}
