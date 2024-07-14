/*Write a program to print the maximum digit in a given number*/

public class recursionpractice3 {

    int max = Integer.MIN_VALUE;

    void productOfDigit(int num) {

        if (num / 10 == 0) {

            return;
        }
        if (num % 10 > max) {

            max = num % 10;
        }
        productOfDigit(num / 10);
    }

    public static void main(String[] args) {

        recursionpractice3 obj = new recursionpractice3();

        obj.productOfDigit(1256585);

        System.out.println(obj.max);
    }
}
