// Write a program to find the factorial of a given range of numbers

import java.util.Scanner;

public class Number_14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // taking user input
        System.out.print("Enter the factorial range number: ");
        long num = sc.nextInt();
        for (int i = 1; i <= num; i++) {
            int mul = 1;
            int temp = i;
            while (temp > 0) {
                mul *= temp;
                temp--;
            }
            System.out.println(i + "!" + "--->" + mul);
        }
        sc.close();
    }
}
