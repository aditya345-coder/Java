// Write a program to find the factorial of a given number

/*
    Factorial: Factorial of a whole number 'n' is defined as the product of that number with every 
               whole number less than or equal to 'n' till 1. 
                For example, the factorial of 4 is 4 × 3 × 2 × 1, which is equal to 24. 
                It is represented using the symbol '!' 
 */
import java.util.Scanner;

public class Number_13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // User input
        System.out.print("Enter the number: ");
        int num = sc.nextInt();

        int mul = 1;
        int temp = num;
        while (temp > 0) {
            mul *= temp;
            temp--;
        }
        System.out.println("The factorial of " + num + " is: " + mul);
        sc.close();
    }
}
