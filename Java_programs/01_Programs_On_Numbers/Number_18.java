// Write a program to display range of Fibonacci series of a number

import java.util.Scanner;

public class Number_18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // taking user input
        System.out.print("Enter number: ");
        int num = sc.nextInt();

        int a = 0;
        int b = 1;
        System.out.print(a + " " + b);
        int c = 0;
        for (int i = 1; i <= num; i++) {
            c = a + b;
            a = b;
            b = c;
            System.out.print(" " + b);
        }
        sc.close();
    }
}
