// Write a program to display sum of 1 to n numbers

import java.util.Scanner;

public class Number_03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of n: ");
        int num = sc.nextInt();
        int sum = 0;
        for (int i = 1; i <= num; i++) {
            sum += i;
        }
        System.out.print("The sum of n number is: " + sum);
        sc.close();
    }

}
