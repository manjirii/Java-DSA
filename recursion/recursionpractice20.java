/*Write a program to check if a given number is an Abundant Number or not
(An abundant number is the sum of all its proper divisors, denoted by sum(n), is greater than the number's value)
FOR LOOP
*/

import java.util.Scanner;

public class recursionpractice20 {

    static boolean isAbundantNumber(int num) {

        if (num <= 1) {
            return false;
        }

        int sumOfDiv = 1;

        for (int i = 2; i <= num / 2; i++) {

            if (num % i == 0) {

                sumOfDiv += i;
            }
        }

        return sumOfDiv > num;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int num = sc.nextInt();

        if (isAbundantNumber(num)) {

            System.out.println(num + " is an Abundant Number");
        } else {

            System.out.println(num + " is not an Abundant Number");
        }
    }
}
