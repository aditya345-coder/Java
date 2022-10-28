// Write a program to find Sum of prime numbers

import java.util.Scanner;

public class Number_07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // taking Input from user
        System.out.print("Enter the range to print sum of prime numbers: ");
        int num = sc.nextInt();

        int sum = 0;
        for (int i = 2; i <= num; i++) {
            int count = 0;
            for (int j = 2; j <= i / 2; j++) {
                if (i % j == 0) {
                    count++;
                    break;
                }
            }
            if (count == 0) {
                sum += i;
            }
        }
        System.out.println("The sum of prime numbers from " + 1 + " to " + num + " is :" + sum);
        sc.close();
    }
}
