/*Write a program to check if a given number is a Harshad Number or not
(A Harshad Number is a number that is divisible by the sum of its digits)
USING FOR LOOP
*/

import java.util.Scanner;

public class recursionpractice16 {

    static boolean isHarshadNumber(int num) {

        int sumOfDigits = 0;
        int temp = num;

        while (num > 0) {

            sumOfDigits += num % 10;
            num /= 10;

        }
        return temp % sumOfDigits == 0;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int num = sc.nextInt();

        if (isHarshadNumber(num)) {

            System.out.println(num + " is a Harshad Number");
        } else {

            System.out.println(num + " is not a Harshad Number");
        }
    }
}
