// Write a program to check the given number is even or odd 
/* Odd numbers: Odd numbers are those numbers that cannot be divided into two equal parts. 
                 Example: 3, 5, 7, 9, 11, 13, 15,… 
   Even numbers: Even numbers are those numbers that can be divided into two equal parts.
                 Example: 2, 4, 6, 8, 10, 12, 14,…
 */

import java.util.Scanner;

public class Number_04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = sc.nextInt();
        if (num % 2 == 0) {
            System.out.printf("%d is even number ", num);
        } else {
            System.out.printf("%d is odd number ", num);
        }
        sc.close();
    }
}
