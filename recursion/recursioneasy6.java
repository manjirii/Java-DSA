/*Write a program to calculate the sum of digits of a given positive integer*/

public class recursioneasy6 {

    static int sumOfDigit(int num) {

        if (num / 10 == 0) {
            return num;
        }

        return sumOfDigit(num / 10) + (num % 10);
    }

    public static void main(String[] args) {

        System.out.println(sumOfDigit(12356));
    }
}
