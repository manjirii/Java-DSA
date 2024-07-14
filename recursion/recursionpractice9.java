/*Write a program to check if a given number is a Magic Number or not.
(A Magic Number is a number in which the eventual sum of the digits is equal to 1)
USING RECURSION
*/

import java.util.Scanner;

public class recursionpractice9 {

    static boolean isMagicNumber(int num) {

        if (num <= 9) {

            return num == 1;
        } else {

            int sum = calculateSumOfDigits(num);
            return isMagicNumber(sum);
        }
    }

    static int calculateSumOfDigits(int num) {

        if (num == 0) {

            return 0;
        } else {

            return num % 10 + calculateSumOfDigits(num / 10);
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number :");
        int number = sc.nextInt();

        if (isMagicNumber(number)) {

            System.out.println(number + " is a magic number");
        } else {

            System.out.println(number + " is not a magic number");
        }
    }

}
