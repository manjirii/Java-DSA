/*Write a program to determine whether a given positive integer is a composite number or not.
USING FOR LOOP
*/

import java.util.Scanner;

public class recursionpractice18 {

    static boolean isComposite(int num) {

        if (num <= 1) {

            return false;
        }

        for (int i = 2; i <= num / 2; i++) {

            if (num % i == 0) {

                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a positive integer: ");
        int num = sc.nextInt();

        if (isComposite(num)) {

            System.out.println(num + " is a Composite number");
        } else {

            System.out.println(num + " is not a Composite number");
        }
    }

}
