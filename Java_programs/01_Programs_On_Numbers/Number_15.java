// Write a program to check the given number is strong or not

/*
    Strong number: Strong number is a special number whose sum of the factorial of digits is 
    equal to the original number. 
    For Example: 145 is strong number. 
*/
import java.util.Scanner;

public class Number_15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // taking user input
        System.out.print("Enter number: ");
        int num = sc.nextInt();

        int n = num;
        int sum = 0;
        while (n > 0) {
            int mul = 1;
            int rem = n % 10;
            int temp = rem;
            while (temp > 0) {
                mul *= temp;
                temp--;
            }
            sum += mul;
            n /= 10;

        }
        if (num == sum) {
            System.out.println(num + " is a strong number");
        } else {
            System.out.println(num + " is not a strong number");
        }
        sc.close();
    }
}
