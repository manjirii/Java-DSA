/*Write a program to check whether a given positive integer is a Perfect number or not
(A Perfect Number is a positive integer that is equal to the sum of its proper divisor, excluding itself)
USING RECURSION
*/

import java.util.Scanner;

public class recursionpractice11 {

    static boolean perfectNum(int num, int divisor, int sum) {
        if (divisor > num / 2) {

            return sum == num;
        }

        if (num % divisor == 0) {

            sum += divisor;
        }

        return perfectNum(num, divisor + 1, sum);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a positive integer : ");
        int num = sc.nextInt();

        if (perfectNum(num, 1, 0)) {

            System.out.println(num + " is a Perfect Number");
        } else {

            System.out.println(num + " is not a Perfect Number");
        }
    }
}
