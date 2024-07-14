/*Write a program to check if a given number is an Abundant Number or not
(An abundant number is the sum of all its proper divisors, denoted by sum(n), is greater than the number's value)
RECURSION
*/

import java.util.Scanner;

public class recursionpractice21 {

    static boolean isAbundantNumber(int num, int i, int sumOfDiv) {

        if (num <= 1) {
            return false;
        }

        if (i > num / 2) {
            return sumOfDiv > num;
        }

        if (num % i == 0) {
            sumOfDiv += i;
        }

        return isAbundantNumber(num, i + 1, sumOfDiv);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number :");
        int num = sc.nextInt();

        if (isAbundantNumber(num, 2, 1)) {

            System.out.println(num + " is an Abundant Number");
        } else {

            System.out.println(num + " is not an Abundant Number");
        }
    }
}
