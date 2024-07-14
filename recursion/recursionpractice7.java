/*Write a program to check whether a given number is a strong Number or not*/
/*Using RECURSION*/

import java.util.Scanner;

public class recursionpractice7 {

    static boolean isStrongNumber(int num, int temp, int sum) {

        if (num == 0) {

            return temp == sum;
        } else {

            int digit = num % 10;
            int fact = calculateFactorial(digit);
            return isStrongNumber(num / 10, temp, sum + fact);
        }
    }

    static int calculateFactorial(int num) {

        if (num == 0 || num == 1) {

            return 1;
        } else {
            return num * calculateFactorial(num - 1);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int number = sc.nextInt();

        if (isStrongNumber(number, number, 0)) {
            System.out.println(number + " is a strong number");
        } else {
            System.out.println(number + " is not a Strong number");
        }
    }
}
