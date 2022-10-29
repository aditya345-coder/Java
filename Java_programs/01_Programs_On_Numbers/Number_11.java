// Write a program to display range of perfect numbers

import java.util.Scanner;

public class Number_11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the range to print perfect numbers: ");
        long num = sc.nextInt();
        for (long i = 1; i <= num; i++) {
            long sum = 0;
            for (long j = 1; j < i; j++) {
                if (i % j == 0) {
                    sum += j;
                }
            }
            if (sum == i) {
                System.out.print(i + " ");
            }
        }
        sc.close();
    }
}
