/*Write a program to determine whether a given positive integer is a composite number or not.
USING RECURSION
*/

import java.util.Scanner;

public class recursionpractice19 {

    static boolean isComposite(int num, int i) {

        if (num <= 1) {
            return false;
        }

        if (i > num / 2) {
            return false;
        }

        if (num % i == 0) {
            return true;
        }

        return isComposite(num, i + 1);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a positive integer : ");
        int num = sc.nextInt();

        if (isComposite(num, 2)) {

            System.out.println(num + " is a Composite Number");
        } else {

            System.out.println(num + " is not a Composite Number");
        }
    }
}
