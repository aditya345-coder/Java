// Write a program to display Fibonacci series of a number

/* fibonacci series : In mathematics, the Fibonacci numbers, commonly denoted Fₙ, 
                      form a sequence, the Fibonacci sequence, 
                      in which each number is the sum of the two preceding ones. 
                      The sequence commonly starts from 0 and 1 
                      Example : 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, 377,.........
*/

import java.util.Scanner;

public class Number_17 {

    // recursion
    int fibonacci(int num) {
        if (num == 0) {
            return 0;
        }
        if (num == 1) {
            return 1;
        }
        return fibonacci(num - 1) + fibonacci(num - 2);

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // taking user input
        System.out.print("Enter number: ");
        int num = sc.nextInt();

        Number_17 fib = new Number_17(); // object
        int res = fib.fibonacci(num);
        System.out.println("The fibonacci series of a number " + num + " is: " + res);
        sc.close();
    }

}
