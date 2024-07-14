/*Write a program to check if a given number is an Armstrong number or not
(An Armstrong number is a number that is equal to the sum of its own digits each raisedto the power of the number 
of digits)
USING RECURSION
*/

import java.util.Scanner;

public class recursionpractice15 {

    static int calculateArmSum(int num, int sum) {

        if (num == 0) {

            return sum;
        }

        int digit = num % 10;
        return calculateArmSum(num / 10, sum + (int) Math.pow(digit, (int) Math.log10(num) + 1));
    }

    static boolean isArmstrongNumber(int num) {

        int sum = calculateArmSum(num, 0);

        return sum == num;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int num = sc.nextInt();

        if (isArmstrongNumber(num)) {

            System.out.println(num + " is an Armstrong Number");
        } else {

            System.out.println(num + " is not an Armstrong Number");
        }
    }
}
