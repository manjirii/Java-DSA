/*Write a program to determine whether a given number is a happy number or not
(A happy number is a number which eventually reaches 1 when replaced by the sum of the square of each digit )
USING RECURSION
*/

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class recursionpractice13 {

    static boolean isHappyNumber(int num, Set<Integer> sawNum) {

        if (num == 1) {

            return true;
        }

        if (!sawNum.add(num)) {

            return false;
        }

        int sum = squareSum(num);
        return isHappyNumber(sum, sawNum);
    }

    static int squareSum(int num) {
        if (num == 0) {

            return 0;
        } else {

            return (num % 10) * (num % 10) + squareSum(num / 10);
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");

        int num = sc.nextInt();

        if (isHappyNumber(num, new HashSet<>())) {

            System.out.println(num + " is a Happy Number");
        } else {

            System.out.println(num + " is not a Happy Number");
        }
    }
}
