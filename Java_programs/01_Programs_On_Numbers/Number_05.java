// Write a program to print prime numbers from 1 to n

public class Number_05 {
    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        System.out.print("Enter the value of n: ");
        int num = sc.nextInt();

        System.out.printf("The prime numbers from 1 to %d are: \n", num);
        for (int i = 2; i <= num; i++) {
            int count = 0;

            for (int j = 2; j <= i / 2; j++) {
                if (i % j == 0) {
                    count++;
                    break;
                }
            }
            if (count == 0) {
                System.out.print(i + " ");
            }
        }
    }
}
