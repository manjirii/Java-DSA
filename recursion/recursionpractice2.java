/*Write a program to print the product of digits of a given number*/

public class recursionpractice2 {

    static int productOfDigits(int num) {

        if (num / 10 == 0) {

            return num;
        }

        return productOfDigits(num / 10) * (num % 10);
    }

    public static void main(String[] args) {

        System.out.println(productOfDigits(12356));
    }

}
