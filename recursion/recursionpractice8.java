/*Write a program to check if a given number is a Magic Number or not.
(A Magic Number is a number in which the eventual sum of the digits is equal to 1)
USING FOR LOOP
*/

import java.util.Scanner;

public class recursionpractice8 {

    static boolean isMagicNumber(int num){

        while (num > 9){

            int sum =0;

            for(; num>0; num /= 10){

                int digit = num %10;
                sum += digit;
            }
            num = sum;
        }
        return num == 1;
    }

    public static void main (String[]args){

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int number = sc. nextInt();

        if(isMagicNumber(number)){

            System.out.println(number + " is a Magic Number");

        }else{

            System.out.println(number + " is not a Magic Number");
        }
    }
    
}
