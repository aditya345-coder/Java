// Write a program to check the given number is even or odd ?

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
