// Write a program to find the range of strong numbers

import java.util.Scanner;

public class Number_16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // User input
        System.out.print("Enter the range to print strong numbers: ");
        int num = sc.nextInt();

        for (int i = 1; i <= num; i++) {
            int temp = i;
            int sum = 0;
            while (temp > 0) {
                int dig_fact = 1;
                int rem = temp % 10;
                while (rem > 0) {
                    dig_fact *= rem;
                    rem--;
                }
                sum += dig_fact;
                temp /= 10;
            }
            if (sum == i) {
                System.out.print(i + " ");
            }
        }
        sc.close();

    }

}
