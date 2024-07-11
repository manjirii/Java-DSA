/*Write a program to print the length of digits in a number*/

public class recursioneasy4 {

    static int numberSum(int num) {

        if (num / 10 == 0) {

            return 1;
        }

        return numberSum(num / 10) + 1;
    }

    public static void main(String[] args) {

        System.out.println(numberSum(1256));
    }
}
