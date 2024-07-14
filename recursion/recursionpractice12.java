/*Write a program to determine whether a given number is a happy number or not
(A happy number is a number which eventually reaches 1 when replaced by the sum of the square of each digit )
USING FOR LOOP
*/

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class recursionpractice12 {

    static boolean isHappyNumber(int num) {

        Set<Integer> sawNum = new HashSet<>();

        while (num != 1 && sawNum.add(num)) {

            int sum = 0;

            while (num > 0) {

                int temp = num % 10;
                sum += temp * temp;
                num /= 10;
            }
            num = sum;
        }
        return num == 1;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int num = sc.nextInt();

        if (isHappyNumber(num)) {

            System.out.println(num + " is a Happy Number");
        } else {

            System.out.println(num + " is not a Happy Number");
        }
    }

}
