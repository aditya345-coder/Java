// Write a program to print 1 to n numbers

import java.util.Scanner;

public class Number_01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of num: ");
        int num = sc.nextInt();
        for (int i = 1; i <= num; i++) {
            System.out.print(i + " ");
        }
        sc.close();
    }

}
