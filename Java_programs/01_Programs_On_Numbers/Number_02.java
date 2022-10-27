// Write a program to print reverse of n to 1 numbers

import java.util.Scanner;

public class Number_02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of num: ");
        int num = sc.nextInt();
        for (int i = num; i > 0; i--) {
            System.out.print(i + " ");
        }
        sc.close();
    }
}
