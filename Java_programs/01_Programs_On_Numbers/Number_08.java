// Write a program to display multiplication table

import java.util.Scanner;

public class Number_08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // taking user input
        System.out.print("Enter the number: ");
        int num = sc.nextInt();

        // printing multiplication table
        for (int i = 1; i <= 10; i++) {
            System.out.println(num + " * " + i + " = " + num * i);
        }
        sc.close();
    }
}
