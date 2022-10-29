// Write a program to check the given number is palendrome or not

/* 
    Palendrome number : A palindrome number is a number that remains the same when digits are reversed.
                        For example, the number 12321 is a palindrome number, but 1451 is not a palindrome number.
 */
import java.util.Scanner;

public class Number_12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // User input
        System.out.print("Enter the number: ");
        int num = sc.nextInt();

        int rev = 0;
        int temp = num; // initiliazing num to temp
        while (temp > 0) {
            int rem = temp % 10;
            rev = rev * 10 + rem; // reverse the num
            temp /= 10;
        }

        if (rev == num) {
            System.out.println("The number " + num + " is palindrome");
        } else {
            System.out.println("The number " + num + " is not palindrome");
        }
        sc.close();
    }

}
