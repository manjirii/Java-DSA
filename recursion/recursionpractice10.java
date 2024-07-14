/*Write a program to check whether a given positive integer is a Perfect number or not
(A Perfect Number is a positive integer that is equal to the sum of its proper divisor, excluding itself)
USING FOR LOOP
*/

import java.util.Scanner;

public class recursionpractice10 {

    static boolean perfectNum(int num) {

        int sum = 0;
        for (int i = 1; i <= num / 2; i++) {

            if (num % i == 0) {

                sum += i;
            }
        }
        return sum == num;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter an integer: ");
        int num = sc.nextInt();

        if (perfectNum(num)) {

            System.out.println(num + " is a Perfect Number");
        } else {

            System.out.println(num + " is not a Perfect Number");
        }
    }

}
