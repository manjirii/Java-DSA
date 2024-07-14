/*Write a program to check if a given number is a Harshad Number or not
(A Harshad Number is a number that is divisible by the sum of its digits)
USING RECURSION
*/

import java.util.Scanner;

public class recursionpractice17 {

    static boolean isHarshadNumber(int num, int temp) {

        if (num == 0) {

            return temp % 10 == 0;
        } else {

            return isHarshadNumber(num / 10, temp) && num % 10 != 0;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int num = sc.nextInt();

        if (isHarshadNumber(num, num)) {

            System.out.println(num + " is a Harshad Number");
        } else {

            System.out.println(num + " is not a Harshad Number");
        }
    }
}
