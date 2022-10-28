
// Write a program whether the number is perfect number or not
/* Perfect number : a perfect number is a positive integer that is equal to the sum of its positive divisors, 
                    excluding the number itself. 
                    Examples : 6 has divisors 1, 2 and 3, and 1 + 2 + 3 = 6, so 6 is a perfect number.
*/
import java.util.Scanner;

public class Number_10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of num: ");
        int num = sc.nextInt();

        int sum = 0;
        for (int i = 1; i < num; i++) {
            if (num % i == 0) {
                sum += i;
            }
        }
        if (sum == num) {
            System.out.println("The number " + num + " is perfect number");
        } else {
            System.out.println("The number " + num + " is not a perfect number");
        }
        sc.close();
    }
}
