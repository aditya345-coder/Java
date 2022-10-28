// Write a program to check whether the given number is prime or not

import java.util.Scanner;

public class Number_06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // taking user input
        System.out.print("Enter the value of num: ");
        int num = sc.nextInt();

        // checking if a number is prime or not
        int flag = 0;
        for (int i = 2; i <= num / 2; i++) {
            if (num % i == 0) {
                flag++;
            }
        }
        if (flag == 0) {
            System.out.println(num + " is prime number");
        } else {
            System.out.println(num + " is not prime number");
        }
        sc.close();
    }
}
