
/*
 * Program: Fibonacci Series
 * Description: Print the Fibonacci series up to N terms.
 * Example: Input = 7
 *          Output = 0 1 1 2 3 5 8
 */

import java.util.Scanner;

class FibonacciSeries {
    public static void main(String args[]) {

        // Create Scanner object
        Scanner sc = new Scanner(System.in);

        // Take input from user
        System.out.print("Enter The Number of Terms: ");
        int num = sc.nextInt();

        int a = 0, b = 1, c;

        // Print Fibonacci series
        for (int i = 1; i <= num; i++) {

            System.out.print(a + " ");

            c = a + b;
            a = b;
            b = c;
        }

        sc.close();
    }
}
