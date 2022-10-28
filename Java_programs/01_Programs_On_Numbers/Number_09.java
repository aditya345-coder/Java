// Write a program to display multiplication tables

import java.util.Scanner;

public class Number_09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // taking user input
        System.out.print("Enter the range to print multiplication table: ");
        int num = sc.nextInt();

        for (int i = 1; i <= num; i++) {
            for (int j = 1; j <= 10; j++) {
                System.out.println(i + " * " + j + " = " + i * j);
            }
            System.out.println();
        }
        sc.close();
    }
}
