/*Write a program to check whether a given number is a strong Number or not*/
/*Using FOR LOOP*/

import java.util.Scanner;

public class recursionpractice6 {

    static boolean isStrongNumber(int num) {

        int temp = num;
        int sum = 0;

        while (num > 0) {

            int digit = num % 10;
            int fact = 1;

            for (int i = 1; i <= digit; i++) {

                fact *= i;
            }

            sum += fact;
            num /= 10;
        }

        return sum == temp;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number :");
        int number = sc.nextInt();

        if (isStrongNumber(number)) {

            System.out.println(number + " is a strong number");
        } else {

            System.out.println(number + " is not a Strong number");
        }
    }
}

/*
RECURSION

static boolean isStrongNumber(int num, int temp){
    if(num == 0){
        return temp==0;
    }else{
        int digit = num%10;
        int fact;

        if(digit == 0 || digit == 1){
            fact = 1;
        }else{
            fact = digit * calculateFactorial(digit - 1);
        }

        return fact + isStrongNumber(num/10, temp);
    }
}
*/
