/*Write a program to check if a given number is an Armstrong number or not
(An Armstrong number is a number that is equal to the sum of its own digits each raisedto the power of the number 
of digits)
USING FOR LOOP
*/

import java.util.Scanner;

public class recursionpractice14 {

    static int countDigits(int num) {

        int count = 0;

        while (num > 0) {

            num /= 10;
            count++;
        }
        return count;
    }

    static boolean isArmstrongNumber(int num) {

        int temp = num;
        int count = countDigits(num);
        int sum = 0;

        while (num > 0) {
            int digit = num % 10;
            int power = 1;

            for (int i = 0; i < count; i++) {

                power *= digit;
            }
            sum += power;
            num /= 10;
        }
        return sum == temp;
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
