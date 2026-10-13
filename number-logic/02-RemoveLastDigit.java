
/*
 * Program: Remove Last Digit
 * Description: Remove the last digit of a number.
 * Example: Input = 1234, Output = 123
 */

import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        // Integer division removes the last digit
        int result = num / 10;

        System.out.println("After removing last digit: " + result);

        sc.close();
    }
}
